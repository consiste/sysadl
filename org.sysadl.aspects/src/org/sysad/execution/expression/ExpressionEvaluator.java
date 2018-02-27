package org.sysad.execution.expression;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;
import org.sysadl.context.exceptions.InvalidExpression;

import sysADL_Sintax.AdditiveExpression;
import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.BooleanLiteralExpression;
import sysADL_Sintax.ClassificationExpression;
import sysADL_Sintax.ConditionalLogicalExpression;
import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.EnumValueLiteralExpression;
import sysADL_Sintax.EqualityExpression;
import sysADL_Sintax.Expression;
import sysADL_Sintax.FeatureReference;
import sysADL_Sintax.LeftHandSide;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.MultiplicativeExpression;
import sysADL_Sintax.NameExpression;
import sysADL_Sintax.NaturalLiteralExpression;
import sysADL_Sintax.NullLiteralExpression;
import sysADL_Sintax.PropertyAccessExpression;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.ThisExpression;

public abstract class ExpressionEvaluator {
	
	/**
	 * Find the correct method and call it, throws exception if invalid type of Expression
	 * @returns
	 */
	public Object evaluate(Expression e, SysADLContext context) throws ContextException {
		if (e instanceof ConditionalTestExpression) return evaluate((ConditionalTestExpression) e, context);
		else if (e instanceof ConditionalLogicalExpression) return evaluate((ConditionalLogicalExpression) e, context);
		else if (e instanceof LogicalExpression) return evaluate((LogicalExpression) e, context);
		else if (e instanceof EqualityExpression) return evaluate((EqualityExpression) e, context);
		else if (e instanceof ClassificationExpression) return evaluate((ClassificationExpression) e, context);
		else if (e instanceof RelationalExpression) return evaluate((RelationalExpression) e, context);
		else if (e instanceof ShiftExpression) return evaluate((ShiftExpression) e, context);
		else if (e instanceof AdditiveExpression) return evaluate((AdditiveExpression) e, context);
		else if (e instanceof MultiplicativeExpression) return evaluate((MultiplicativeExpression) e, context);
		else if (e instanceof NameExpression) return evaluate((NameExpression) e, context);
		else if (e instanceof BooleanLiteralExpression) return evaluate((BooleanLiteralExpression) e, context);
		else if (e instanceof NaturalLiteralExpression) return evaluate((NaturalLiteralExpression) e, context);
		else if (e instanceof StringLiteralExpression) return evaluate((StringLiteralExpression) e, context);
		else if (e instanceof ThisExpression) return evaluate((ThisExpression) e, context);
		else if (e instanceof PropertyAccessExpression) return evaluate((PropertyAccessExpression) e, context);
		else if (e instanceof FeatureReference) return evaluate((FeatureReference) e, context);
		else if (e instanceof AssignmentExpression) return evaluate((AssignmentExpression) e, context);
		else if (e instanceof LeftHandSide) return evaluate((LeftHandSide) e, context);
		else if (e instanceof EnumValueLiteralExpression) return evaluate((EnumValueLiteralExpression) e, context);
		else if (e instanceof NullLiteralExpression) return evaluate((NullLiteralExpression) e, context);
		throw new InvalidExpression(e);
	}

	public abstract Object evaluate(ConditionalTestExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(ConditionalLogicalExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(LogicalExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(EqualityExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(ClassificationExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(RelationalExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(ShiftExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(AdditiveExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(MultiplicativeExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(NameExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(BooleanLiteralExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(NaturalLiteralExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(StringLiteralExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(EnumValueLiteralExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(NullLiteralExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(ThisExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(PropertyAccessExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(FeatureReference e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(AssignmentExpression e, SysADLContext context) throws ContextException;
	public abstract Object evaluate(LeftHandSide e, SysADLContext context) throws ContextException;

}
