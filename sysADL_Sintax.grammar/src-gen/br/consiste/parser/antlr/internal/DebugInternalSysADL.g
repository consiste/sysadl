/*
 * generated by Xtext 2.10.0
 */
grammar DebugInternalSysADL;

// Rule Model
ruleModel:
	'Model'
	RULE_ID
	';'
	(
		'using'
		ruleQualifiedName
		';'
	)*
	(
		ruleProperty
		    |
		rulePackage
		    |
		ruleRequirement
	)*
	ruleAllocationTable
	?
;

// Rule ElementDef
ruleElementDef:
	(
		ruleDataTypeDef
		    |
		ruleDimensionDef
		    |
		ruleUnitDef
		    |
		ruleValueTypeDef
		    |
		ruleEnumeration
		    |
		ruleComponentDef
		    |
		ruleConnectorDef
		    |
		ruleCompositePortDef
		    |
		ruleSimplePortDef
		    |
		ruleActionDef
		    |
		ruleActivityDef
		    |
		ruleProtocol
		    |
		ruleConstraintDef
		    |
		ruleExecutable
	)
;

// Rule TypeUse
ruleTypeUse:
	ruleTypeUse_Impl
;

// Rule StructuralDef
ruleStructuralDef:
	(
		ruleComponentDef
		    |
		ruleConnectorDef
		    |
		ruleCompositePortDef
		    |
		ruleSimplePortDef
	)
;

// Rule DataDef
ruleDataDef:
	(
		ruleDataTypeDef
		    |
		ruleDimensionDef
		    |
		ruleUnitDef
		    |
		ruleValueTypeDef
		    |
		ruleEnumeration
	)
;

// Rule ComponentDef
ruleComponentDef:
	'boundary'
	?
	'component'
	'def'
	RULE_ID
	'{'
	(
		'ports'
		rulePortUse
		*
	)?
	(
		ruleProperty
		    |
		ruleStructuralDef
		    |
		ruleDataDef
	)*
	ruleConfiguration
	?
	'}'
;

// Rule ArchitectureDef
ruleArchitectureDef:
	'architecture'
	'def'
	RULE_ID
	'{'
	'ports'
	rulePortUse
	*
	ruleProperty
	*
	ruleConfiguration
	'}'
;

// Rule Pin
rulePin:
	RULE_ID
	':'
	'flow'
	?
	ruleQualifiedName
;

// Rule BehaviorDef
ruleBehaviorDef:
	(
		ruleActivityDef
		    |
		ruleProtocol
		    |
		ruleConstraintDef
		    |
		ruleActionDef
	)
;

// Rule ActionUse
ruleActionUse:
	RULE_ID
	':'
	ruleQualifiedName
	'{'
	(
		'using'
		'pins'
		rulePin
		*
	)?
	ruleProperty
	*
	'}'
;

// Rule ActivityRelation
ruleActivityRelation:
	(
		ruleActivityDelegation
		    |
		ruleActivityFlow
	)
;

// Rule DataObject
ruleDataObject:
	(
		ruleDataStore
		    |
		ruleDataBuffer
	)
;

// Rule EString
ruleEString:
	(
		RULE_STRING
		    |
		RULE_ID
	)
;

// Rule Property
ruleProperty:
	'property'
	RULE_ID
	(
		':'
		ruleQualifiedName
	)?
	(
		'='
		ruleExpression
	)?
	';'
;

// Rule Package
rulePackage:
	'package'
	ruleQualifiedName
	'{'
	(
		'import'
		ruleQualifiedName
		';'
	)*
	(
		'using'
		ruleQualifiedName
		';'
	)*
	(
		ruleProperty
		    |
		ruleElementDef
		    |
		ruleArchitectureDef
	)*
	'}'
;

// Rule Requirement
ruleRequirement:
	'Requirement'
	RULE_ID
	'('
	ruleEFloat
	')'
	'{'
	(
		'text'
		'='
		ruleEString
	)?
	(
		'satisfiedBy'
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
		';'
	)?
	(
		'derive'
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
		';'
	)?
	(
		ruleProperty
		    |
		ruleRequirement
	)*
	'}'
;

// Rule DataTypeDef
ruleDataTypeDef:
	'datatype'
	RULE_ID
	(
		'extends'
		ruleQualifiedName
	)?
	'{'
	(
		'attributes'
		ruleTypeUse
		*
	)?
	ruleProperty
	*
	'}'
;

// Rule ValueTypeDef
ruleValueTypeDef:
	'value'
	'type'
	RULE_ID
	(
		'extends'
		ruleQualifiedName
	)?
	'{'
	(
		'unit'
		'='
		ruleQualifiedName
	)?
	(
		'dimension'
		'='
		ruleQualifiedName
	)?
	ruleProperty
	*
	'}'
;

// Rule Enumeration
ruleEnumeration:
	'enum'
	RULE_ID
	'{'
	ruleProperty
	*
	ruleEnumLiteralValue
	(
		','
		ruleEnumLiteralValue
	)*
	'}'
;

// Rule TypeUse_Impl
ruleTypeUse_Impl:
	RULE_ID
	':'
	ruleQualifiedName
	(
		'{'
		ruleProperty
		*
		'}'
	)?
;

// Rule EnumLiteralValue
ruleEnumLiteralValue:
	ruleEString
;

// Rule DimensionDef
ruleDimensionDef:
	'dimension'
	RULE_ID
	(
		'{'
		(
			ruleProperty
			(
				','
				ruleProperty
			)*
		)?
		'}'
	)?
;

// Rule UnitDef
ruleUnitDef:
	'unit'
	RULE_ID
	'{'
	(
		'dimension'
		'='
		ruleQualifiedName
	)?
	(
		ruleProperty
		(
			','
			ruleProperty
		)*
		'}'
	)?
	'}'
;

// Rule ComponentUse
ruleComponentUse:
	RULE_ID
	':'
	ruleQualifiedName
	(
		'['
		ruleEInt
		','
		ruleEInt
		']'
	)?
	'{'
	(
		'using'
		'ports'
		rulePortUse
		*
	)?
	ruleProperty
	*
	'}'
;

// Rule ConnectorDef
ruleConnectorDef:
	'connector'
	'def'
	RULE_ID
	'{'
	(
		'participants'
		rulePortUse_Reverse
		*
	)?
	ruleConfiguration
	?
	(
		'flows'
		ruleFlow
		*
	)?
	(
		ruleProperty
		    |
		ruleStructuralDef
		    |
		ruleDataDef
	)*
	'}'
;

// Rule ConnectorUse
ruleConnectorUse:
	RULE_ID
	':'
	ruleQualifiedName
	(
		'['
		ruleEInt
		','
		ruleEInt
		']'
	)?
	(
		'bindings'
		ruleConnectorBinding
		(
			','
			ruleConnectorBinding
		)*
	)?
	(
		'{'
		'ports'
		rulePortUse_Reverse
		*
		ruleProperty
		*
		'}'
	)?
;

// Rule CompositePortDef
ruleCompositePortDef:
	'port'
	'def'
	RULE_ID
	'{'
	'ports'
	rulePortUse
	*
	(
		ruleProperty
		    |
		ruleStructuralDef
		    |
		ruleDataDef
	)*
	'}'
;

// Rule SimplePortDef
ruleSimplePortDef:
	'port'
	'def'
	RULE_ID
	'{'
	'flow'
	ruleFlowProperty
	ruleQualifiedName
	(
		ruleProperty
		    |
		ruleStructuralDef
		    |
		ruleDataDef
	)*
	'}'
;

// Rule PortUse
rulePortUse:
	RULE_ID
	':'
	ruleQualifiedName
	(
		'['
		ruleEInt
		','
		ruleEInt
		']'
	)?
	'{'
	ruleProperty
	*
	'}'
;

// Rule PortUse_Reverse
rulePortUse_Reverse:
	'~'
	RULE_ID
	':'
	ruleQualifiedName
	(
		'['
		ruleEInt
		','
		ruleEInt
		']'
	)?
	'{'
	ruleProperty
	*
	'}'
;

// Rule ActionDef
ruleActionDef:
	'action'
	'def'
	RULE_ID
	'('
	rulePin
	(
		','
		rulePin
	)*
	')'
	':'
	ruleQualifiedName
	'{'
	(
		ruleConstraintUse
		    |
		ruleActivityDelegation
		    |
		ruleProperty
		    |
		ruleBehaviorDef
		    |
		ruleDataDef
	)*
	'}'
;

// Rule ActivityDef
ruleActivityDef:
	'activity'
	'def'
	RULE_ID
	'('
	rulePin
	(
		','
		rulePin
	)*
	')'
	(
		':'
		rulePin
		(
			','
			rulePin
		)*
	)?
	'{'
	(
		ruleProperty
		    |
		ruleBehaviorDef
		    |
		ruleDataDef
	)*
	(
		'constraint'
		':'
		ruleConstraintUse
		*
	)?
	ruleActivityDelegation
	*
	ruleActivityBody
	?
	'}'
;

// Rule DataStore
ruleDataStore:
	'datastore'
	RULE_ID
	':'
	ruleQualifiedName
	'{'
	ruleProperty
	*
	(
		'initial'
		'value'
		'='
		ruleExpression
	)?
	'}'
;

// Rule DataBuffer
ruleDataBuffer:
	'buffer'
	RULE_ID
	'{'
	'type'
	ruleQualifiedName
	(
		'properties'
		'{'
		ruleProperty
		(
			','
			ruleProperty
		)*
		'}'
	)?
	(
		'initValue'
		ruleExpression
	)?
	'}'
;

// Rule Protocol
ruleProtocol:
	'protocol'
	RULE_ID
	'('
	rulePin
	(
		','
		rulePin
	)*
	')'
	(
		':'
		rulePin
		(
			','
			rulePin
		)*
	)?
	'{'
	(
		ruleProperty
		ruleBehaviorDef
		ruleDataDef
	)*
	(
		'delegations'
		':'
		ruleActivityDelegation
		*
	)?
	ruleProtocolBody
	'}'
;

// Rule ConstraintDef
ruleConstraintDef:
	'constraint'
	RULE_ID
	'('
	rulePin
	(
		','
		rulePin
	)*
	')'
	(
		':'
		rulePin
		(
			','
			rulePin
		)*
	)?
	'{'
	(
		'equation'
		'='
		ruleExpression
	)?
	ruleProperty
	*
	'}'
;

// Rule Executable
ruleExecutable:
	'executable'
	'def'
	RULE_ID
	'('
	(
		'in'
		ruleTypeUse
		(
			','
			'in'
			ruleTypeUse
		)*
	)?
	')'
	':'
	'out'
	ruleQualifiedName
	'{'
	ruleNonBlockStatement
	*
	'}'
;

// Rule Statement
ruleStatement:
	(
		ruleExpression
		    |
		ruleBlockStatement
		    |
		ruleVariableDecl
		    |
		ruleReturnStatement
		    |
		ruleWhileStatement
		    |
		ruleDoStatement
		    |
		ruleForStatement
		    |
		ruleSwitchStatement
	)
;

// Rule NonBlockStatement
ruleNonBlockStatement:
	(
		ruleExpression
		    |
		ruleVariableDecl
		    |
		ruleReturnStatement
		    |
		ruleWhileStatement
		    |
		ruleDoStatement
		    |
		ruleForStatement
	)
;

// Rule BlockStatement
ruleBlockStatement:
	'{'
	ruleStatement
	*
	'}'
;

// Rule VariableDecl
ruleVariableDecl:
	'let'
	RULE_ID
	':'
	ruleQualifiedName
	'='
	ruleExpression
;

// Rule IfStatement
ruleIfStatement:
	'if'
	'('
	ruleExpression
	')'
	ruleStatement
;

// Rule ElseStatement
ruleElseStatement:
	'else'
	ruleStatement
;

// Rule ReturnStatement
ruleReturnStatement:
	'return'
	ruleExpression
;

// Rule WhileStatement
ruleWhileStatement:
	'while'
	'('
	ruleExpression
	')'
	ruleStatement
;

// Rule DoStatement
ruleDoStatement:
	'do'
	ruleStatement
	'while'
	'('
	ruleExpression
	')'
;

// Rule ForStatement
ruleForStatement:
	'for'
	'('
	ruleForControl
	')'
	ruleStatement
;

// Rule ForControl
ruleForControl:
	ruleForVar
	','
	ruleForVar
;

// Rule ForVar
ruleForVar:
	'forvar'
;

// Rule SwitchStatement
ruleSwitchStatement:
	'switch'
	'('
	ruleExpression
	')'
	'{'
	ruleSwitchClause
	*
	ruleDefaultSwitchClause
	'}'
;

// Rule SwitchClause
ruleSwitchClause:
	'case'
	ruleExpression
	':'
	ruleStatement
;

// Rule DefaultSwitchClause
ruleDefaultSwitchClause:
	'default'
	':'
	ruleStatement
;

// Rule Expression
ruleExpression:
	(
		ruleEString
		    |
		ruleConditionalExpression
	)
;

// Rule NameExpression
ruleNameExpression:
	ruleQualifiedName
;

// Rule NonNameExpression
ruleNonNameExpression:
	(
		ruleLiteralExpression
		    |
		ruleThisExpression
		    |
		ruleParenthesizedExpression
	)
;

// Rule LiteralExpression
ruleLiteralExpression:
	(
		ruleBooleanLiteralExpression
		    |
		ruleNaturalLiteralExpression
		    |
		ruleStringLiteralExpression
	)
;

// Rule BooleanLiteralExpression
ruleBooleanLiteralExpression:
	'true'
;

// Rule NaturalLiteralExpression
ruleNaturalLiteralExpression:
	RULE_INT
;

// Rule StringLiteralExpression
ruleStringLiteralExpression:
	RULE_STRING
;

// Rule ThisExpression
ruleThisExpression:
	'this'
;

// Rule ParenthesizedExpression
ruleParenthesizedExpression:
	'('
	ruleExpression
	')'
;

// Rule UnaryExpression
ruleUnaryExpression:
	'unary'
;

// Rule ConditionalAndOrConditionalOrExpression
ruleConditionalAndOrConditionalOrExpression:
	(
		ruleInclusiveOrOrConditionalAndExpression
		    |
		(
			(ruleInclusiveOrOrConditionalAndExpression
			)=>
			ruleConditionalOrExpression
		)
	)
;

// Rule InclusiveOrOrConditionalAndExpression
ruleInclusiveOrOrConditionalAndExpression:
	(
		ruleExclusiveOrOrInclusiveOrExpression
		    |
		(
			(ruleExclusiveOrOrInclusiveOrExpression
			)=>
			ruleConditionalAndExpression
		)
	)
;

// Rule ExclusiveOrOrInclusiveOrExpression
ruleExclusiveOrOrInclusiveOrExpression:
	(
		ruleAndOrExclusiveOrExpression
		    |
		(
			(ruleAndOrExclusiveOrExpression
			)=>
			ruleInclusiveOrExpression
		)
	)
;

// Rule AndOrExclusiveOrExpression
ruleAndOrExclusiveOrExpression:
	(
		ruleEqualityOrAndExpression
		    |
		(
			(ruleEqualityOrAndExpression
			)=>
			ruleExclusiveOrExpression
		)
	)
;

// Rule EqualityOrAndExpression
ruleEqualityOrAndExpression:
	(
		ruleClassificationOrEqualityExpression
		    |
		(
			(ruleClassificationOrEqualityExpression
			)=>
			ruleAndExpression
		)
	)
;

// Rule ClassificationOrEqualityExpression
ruleClassificationOrEqualityExpression:
	(
		ruleRelationalOrClassificationExpression
		    |
		(
			(ruleRelationalOrClassificationExpression
			)=>
			ruleEqualityExpression
		)
	)
;

// Rule RelationalOrClassificationExpression
ruleRelationalOrClassificationExpression:
	(
		ruleArithmeticOrRelationalExpression
		    |
		(
			(ruleArithmeticOrRelationalExpression
			)=>
			ruleClassificationExpression
		)
	)
;

// Rule ArithmeticOrRelationalExpression
ruleArithmeticOrRelationalExpression:
	(
		ruleUnaryOrArithmeticExpression
		    |
		(
			(ruleArithmeticOrShiftExpression
			)=>
			ruleRelationalExpression
		)
	)
;

// Rule UnaryOrArithmeticExpression
ruleUnaryOrArithmeticExpression:
	(
		ruleUnaryOrMultiplicativeExpression
		    |
		(
			(ruleUnaryOrMultiplicativeExpression
			)=>
			ruleAdditiveExpression
		)
	)
;

// Rule UnaryOrMultiplicativeExpression
ruleUnaryOrMultiplicativeExpression:
	(
		ruleUnaryExpression
		    |
		ruleMultiplicativeExpression
	)
;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression:
	ruleUnaryExpression
	(
		'*'
		    |
		'/'
		    |
		'%'
	)
	ruleUnaryOrMultiplicativeExpression
;

// Rule AdditiveExpression
ruleAdditiveExpression:
	(
		(ruleUnaryOrMultiplicativeExpression
		)=>
		ruleUnaryOrMultiplicativeExpression
	)
	(
		'+'
		    |
		'-'
	)
	ruleUnaryOrArithmeticExpression
;

// Rule RelationalExpression
ruleRelationalExpression:
	(
		(ruleArithmeticOrShiftExpression
		)=>
		ruleArithmeticOrShiftExpression
	)
	(
		'<'
		    |
		'>'
		    |
		'<='
		    |
		'>='
	)
	ruleArithmeticOrShiftExpression
;

// Rule ArithmeticOrShiftExpression
ruleArithmeticOrShiftExpression:
	(
		ruleUnaryOrArithmeticExpression
		    |
		(
			(ruleUnaryOrArithmeticExpression
			)=>
			ruleShiftExpression
		)
	)
;

// Rule ShiftExpression
ruleShiftExpression:
	(
		(ruleUnaryOrArithmeticExpression
		)=>
		ruleUnaryOrArithmeticExpression
	)
	(
		'<<'
		    |
		'>>'
		    |
		'>>>'
	)
	ruleArithmeticOrShiftExpression
;

// Rule ClassificationExpression
ruleClassificationExpression:
	(
		(ruleArithmeticOrRelationalExpression
		)=>
		ruleArithmeticOrRelationalExpression
	)
	(
		'instanceof'
		    |
		'hastype'
	)
	ruleQualifiedName
;

// Rule EqualityExpression
ruleEqualityExpression:
	(
		(ruleRelationalOrClassificationExpression
		)=>
		ruleRelationalOrClassificationExpression
	)
	(
		'='
		    |
		'!='
	)
	ruleClassificationOrEqualityExpression
;

// Rule AndExpression
ruleAndExpression:
	(
		(ruleClassificationOrEqualityExpression
		)=>
		ruleClassificationOrEqualityExpression
	)
	'&'
	ruleEqualityOrAndExpression
;

// Rule ExclusiveOrExpression
ruleExclusiveOrExpression:
	(
		(ruleEqualityOrAndExpression
		)=>
		ruleEqualityOrAndExpression
	)
	'^'
	ruleAndOrExclusiveOrExpression
;

// Rule InclusiveOrExpression
ruleInclusiveOrExpression:
	(
		(ruleAndOrExclusiveOrExpression
		)=>
		ruleAndOrExclusiveOrExpression
	)
	'|'
	ruleExclusiveOrOrInclusiveOrExpression
;

// Rule ConditionalAndExpression
ruleConditionalAndExpression:
	(
		(ruleExclusiveOrOrInclusiveOrExpression
		)=>
		ruleExclusiveOrOrInclusiveOrExpression
	)
	'&&'
	ruleInclusiveOrOrConditionalAndExpression
;

// Rule ConditionalOrExpression
ruleConditionalOrExpression:
	(
		(ruleInclusiveOrOrConditionalAndExpression
		)=>
		ruleInclusiveOrOrConditionalAndExpression
	)
	'||'
	ruleConditionalAndOrConditionalOrExpression
;

// Rule ConditionalExpression
ruleConditionalExpression:
	(
		ruleConditionalAndOrConditionalOrExpression
		    |
		(
			(ruleConditionalAndOrConditionalOrExpression
			)=>
			ruleConditionalTestExpression
		)
	)
;

// Rule ConditionalTestExpression
ruleConditionalTestExpression:
	(
		(ruleConditionalAndOrConditionalOrExpression
		)=>
		ruleConditionalAndOrConditionalOrExpression
	)
	'?'
	ruleExpression
	':'
	ruleConditionalExpression
;

// Rule QualifiedName
ruleQualifiedName:
	(
		ruleColonQualifiedName
		    |
		ruleDotQualifiedName
		    |
		RULE_ID
	)
;

// Rule ColonQualifiedName
ruleColonQualifiedName:
	RULE_ID
	'::'
	ruleQualifiedName
;

// Rule DotQualifiedName
ruleDotQualifiedName:
	RULE_ID
	(
		'.'
		RULE_ID
	)+
;

// Rule EInt
ruleEInt:
	'-'?
	RULE_INT
;

// Rule Configuration
ruleConfiguration:
	'configuration'
	'{'
	(
		'components'
		':'
		ruleComponentUse
		*
	)?
	(
		'connectors'
		':'
		ruleConnectorUse
		*
	)?
	(
		'delegations'
		':'
		ruleDelegation
		*
	)?
	'}'
;

// Rule Delegation
ruleDelegation:
	ruleQualifiedName
	'to'
	ruleQualifiedName
;

// Rule Flow
ruleFlow:
	ruleQualifiedName
	'from'
	ruleQualifiedName
	'to'
	ruleQualifiedName
;

// Rule ConnectorBinding
ruleConnectorBinding:
	ruleQualifiedName
	'='
	ruleQualifiedName
;

// Rule ConstraintUse
ruleConstraintUse:
	ruleConstraintKind
	ruleQualifiedName
	'('
	(
		ruleQualifiedName
		(
			','
			ruleQualifiedName
		)*
	)?
	')'
;

// Rule ActivityDelegation
ruleActivityDelegation:
	'delegate'
	ruleQualifiedName
	'to'
	(
		ruleQualifiedName
		    |
		ruleActivitySwitch
	)
;

// Rule ActivitySwitch
ruleActivitySwitch:
	'switch'
	'{'
	(
		ruleActivitySwitchCase
		(
			','
			ruleActivitySwitchCase
		)*
	)?
	'}'
;

// Rule ActivitySwitchCase
ruleActivitySwitchCase:
	'case'
	ruleExpression
	':'
	ruleQualifiedName
;

// Rule ActivityBody
ruleActivityBody:
	'body'
	'{'
	(
		'actions'
		':'
		ruleActionUse
		*
	)?
	ruleActivityRelation
	*
	ruleDataObject
	*
	'}'
;

// Rule ProtocolBody
ruleProtocolBody:
	ruleProtocolControl
	ruleProtocolBodyInternal
	(
		ruleProtocolAlternativeType
		ruleProtocolBody
	)?
;

// Rule ProtocolBodyInternal
ruleProtocolBodyInternal:
	(
		'('
		ruleProtocolBody
		')'
		    |
		ruleActionSend
		    |
		ruleActionReceive
	)
;

// Rule ActionSend
ruleActionSend:
	'send'
	ruleExpression
	'via'
	ruleQualifiedName
;

// Rule ActionReceive
ruleActionReceive:
	'receive'
	ruleTypeUse
	'from'
	ruleQualifiedName
;

// Rule ActivityFlow
ruleActivityFlow:
	'flow'
	'from'
	ruleQualifiedName
	'to'
	(
		ruleQualifiedName
		    |
		ruleActivitySwitch
	)?
;

// Rule AllocationTable
ruleAllocationTable:
	'allocations'
	'{'
	ruleAllocation
	*
	'}'
;

// Rule Allocation
ruleAllocation:
	(
		ruleExecutableAllocation
		    |
		ruleActivityAllocation
	)
;

// Rule ExecutableAllocation
ruleExecutableAllocation:
	'executable'
	(
		ruleQualifiedName
		    |
		'null'
	)
	'to'
	(
		ruleQualifiedName
		    |
		'null'
	)
;

// Rule ActivityAllocation
ruleActivityAllocation:
	'activity'
	(
		ruleQualifiedName
		    |
		'null'
	)
	'to'
	(
		ruleQualifiedName
		    |
		'null'
	)
;

// Rule EFloat
ruleEFloat:
	'-'?
	RULE_INT?
	'.'
	RULE_INT
	(
		(
			'E'
			    |
			'e'
		)
		'-'?
		RULE_INT
	)?
;

// Rule FlowProperty
ruleFlowProperty:
	(
		'in'
		    |
		'out'
	)
;

// Rule ConstraintKind
ruleConstraintKind:
	(
		'pre-condition'
		    |
		'post-condition'
		    |
		'invariant'
	)
;

// Rule ProtocolAlternativeType
ruleProtocolAlternativeType:
	(
		';'
		    |
		'|'
	)
;

// Rule ProtocolControl
ruleProtocolControl:
	(
		'always'
		    |
		'several'
		    |
		'once'
		    |
		'perhaps'
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_ANY_OTHER : .;
