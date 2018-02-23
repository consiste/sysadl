package org.sysad.execution.expression;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;

import sysADL_Sintax.AdditiveExpression;
import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.BooleanLiteralExpression;
import sysADL_Sintax.ClassificationExpression;
import sysADL_Sintax.ConditionalLogicalExpression;
import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.EqualityExpression;
import sysADL_Sintax.EqualityOperator;
import sysADL_Sintax.Expression;
import sysADL_Sintax.FeatureReference;
import sysADL_Sintax.LeftHandSide;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.MultiplicativeExpression;
import sysADL_Sintax.NameExpression;
import sysADL_Sintax.NaturalLiteralExpression;
import sysADL_Sintax.PropertyAccessExpression;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.ThisExpression;

public class ExpressionEvaluatorImpl implements ExpressionEvaluator {
	
	/**
	 * Expression is abstract, this method shall never be used
	 * @returns null, always
	 */
	@Override
	public Object evaluate(Expression e, SysADLContext context) throws ContextException {
		return null;
	}

	/**
	 * ConditionalTestExpression
	 * Format: op1 ? op2 : op3
	 * @returns op2 if op1 is true, op3 otherwise
	 */
	@Override
	public Object evaluate(ConditionalTestExpression e, SysADLContext context) throws ContextException {
		Object test = evaluate(e.getOp1(), context);
		if (test instanceof Boolean) return ((Boolean)test ? evaluate(e.getOp2(), context) : evaluate(e.getOp3(), context));
		// case test is not boolean, will always execute the second part
		else return evaluate(e.getOp3(), context);
	}

	/**
	 * ConditionalLogicalExpression
	 * Format: op1 operator op2
	 * @returns op1 and/or op2, if one of the operands is not boolean, returns false 
	 */
	@Override
	public Object evaluate(ConditionalLogicalExpression e, SysADLContext context) throws ContextException {
		Object leftSide = evaluate(e.getOp1(), context);
		Expression rightSide = e.getOp2();
		String operator = e.getOperator();
		if (operator.compareTo("&&")==0) { // operator is &&
			if (leftSide instanceof Boolean && (Boolean) leftSide) { // Right side will only be evaluate if leftSide is true
				return evaluate(rightSide, context);
			} else {
				return false; // if one of the objects is not boolean, returns false automatically
			}
		} else { // operator is ||
			if (leftSide instanceof Boolean) {
				if  ((Boolean) leftSide) return true;
				else return evaluate(rightSide, context);
			} else {
				// what to do ih leftSide is not a boolean? right now, return false automatically
				return false;
			}
		}
	}

	/**
	 * LogicalExpression
	 * Format: op1 operator op2
	 * @returns op1 and/exclusiveOr/inclusiveOr op2, if one of the operands is not boolean, returns false
	 */
	@Override
	public Object evaluate(LogicalExpression e, SysADLContext context) throws ContextException {
		Object leftSide = evaluate(e.getOp1(), context);
		Expression rightSide = e.getOp2();
		String operator = e.getOperator();
		if (operator.compareTo("&")==0) { // and
			if (leftSide instanceof Boolean && (Boolean) leftSide) { // Right side will only be evaluate if leftSide is true
				return evaluate(rightSide, context);
			} else {
				return false; // if one of the objects is not boolean, returns false automatically
			}
		} else if (operator.compareTo("^")==0) { // exclusive or
			Object rightSideValue = evaluate(rightSide, context);
			if ((leftSide instanceof Boolean) && (rightSideValue instanceof Boolean)) {
				if  ((Boolean) leftSide) {
					return !((Boolean) rightSideValue); // if left is true, returns negation of right
				} else {
					return (Boolean) rightSideValue; // otherwise returns right
				}
			}
			else {
				return false;
			}
		} else { // inclusive or
			if (leftSide instanceof Boolean) {
				if  ((Boolean) leftSide) return true;
				else return evaluate(rightSide, context);
			} else {
				// what to do ih leftSide is not a boolean? right now, return false automatically
				return false;
			}
		}
	}

	/**
	 * EqualityExpression
	 * @returns op1 ==/!= op2
	 * @fixme probably will need some fixes, this uses the object's equals that shall not work for many cases
	 */
	@Override
	public Object evaluate(EqualityExpression e, SysADLContext context) throws ContextException {
		Object left = evaluate(e.getOp1(), context);
		Object right = evaluate(e.getOp2(), context);
		// first test, if they have different classes, return false
		if (left.getClass() != right.getClass()) return false; 
		if (e.getOperator() == EqualityOperator.EQUAL_LITERAL) {
			return left.equals(right);
		}
		else return !left.equals(right);
	}

	@Override
	public Object evaluate(ClassificationExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(RelationalExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(ShiftExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(AdditiveExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(MultiplicativeExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * NameExpression
	 * @returns NamedElement, automatically done by Xtext
	 */
	@Override
	public Object evaluate(NameExpression e, SysADLContext context) throws ContextException {
		return e.getCite();
	}

	/**
	 * BooleanLiteralExpression
	 * @returns boolean value
	 */
	@Override
	public Object evaluate(BooleanLiteralExpression e, SysADLContext context) throws ContextException {
		return e.isIsTrue();
	}

	/**
	 * NaturalLiteralExpression
	 * @returns double value
	 */
	@Override
	public Object evaluate(NaturalLiteralExpression e, SysADLContext context) throws ContextException {
		return e.getInt_value();
	}

	/**
	 * StringLiteralExpression
	 * @returns string value
	 */
	@Override
	public Object evaluate(StringLiteralExpression e, SysADLContext context) throws ContextException {
		return e.getStr_value();
	}

	@Override
	public Object evaluate(ThisExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(PropertyAccessExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(FeatureReference e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(AssignmentExpression e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object evaluate(LeftHandSide e, SysADLContext context) throws ContextException {
		// TODO Auto-generated method stub
		return null;
	}

}
