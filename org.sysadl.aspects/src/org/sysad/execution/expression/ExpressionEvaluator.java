package org.sysad.execution.expression;

import org.sysadl.context.SysADLContext;
import org.sysadl.context.exceptions.ContextException;

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
import sysADL_Sintax.PropertyAccessExpression;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.ThisExpression;

public interface ExpressionEvaluator {
	public Object evaluate(Expression e, SysADLContext context) throws ContextException;
	public Object evaluate(ConditionalTestExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(ConditionalLogicalExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(LogicalExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(EqualityExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(ClassificationExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(RelationalExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(ShiftExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(AdditiveExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(MultiplicativeExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(NameExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(BooleanLiteralExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(NaturalLiteralExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(StringLiteralExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(EnumValueLiteralExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(ThisExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(PropertyAccessExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(FeatureReference e, SysADLContext context) throws ContextException;
	public Object evaluate(AssignmentExpression e, SysADLContext context) throws ContextException;
	public Object evaluate(LeftHandSide e, SysADLContext context) throws ContextException;

}
