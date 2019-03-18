package org.sysadl.execution.expression;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;
import org.sysadl.context.exceptions.InvalidExpression;

import org.sysadl.AdditiveExpression;
import org.sysadl.AssignmentExpression;
import org.sysadl.BooleanLiteralExpression;
import org.sysadl.ClassificationExpression;
import org.sysadl.ConditionalLogicalExpression;
import org.sysadl.ConditionalTestExpression;
import org.sysadl.EnumValueLiteralExpression;
import org.sysadl.EqualityExpression;
import org.sysadl.Expression;
import org.sysadl.FeatureReference;
import org.sysadl.InstanceCreationExpression;
import org.sysadl.LeftHandSide;
import org.sysadl.LogicalExpression;
import org.sysadl.MultiplicativeExpression;
import org.sysadl.NameExpression;
import org.sysadl.NaturalLiteralExpression;
import org.sysadl.NullLiteralExpression;
import org.sysadl.PropertyAccessExpression;
import org.sysadl.RelationalExpression;
import org.sysadl.ShiftExpression;
import org.sysadl.StringLiteralExpression;
import org.sysadl.ThisExpression;

public abstract class ExpressionEvaluator {
	
	/**
	 * Find the correct method and call it, throws exception if invalid type of Expression
	 * @returns
	 */
	public Object evaluate(Expression e, SysADLContext context) throws ContextException {
		if (e==null) return null; // null expressions always returns null
		else if (e instanceof ConditionalTestExpression) return evaluate((ConditionalTestExpression) e, context);
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
		else if (e instanceof InstanceCreationExpression) return evaluate((InstanceCreationExpression) e, context);
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
	public abstract Object evaluate(InstanceCreationExpression e, SysADLContext context) throws ContextException;

}
