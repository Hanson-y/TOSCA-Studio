/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme'"
 * @generated
 */
public interface Action extends Category {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv containedAction:\n *   let severity : Integer[1] = \'Action::containedAction\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = if self.oclContainer.oclIsTypeOf(Kind)\n *           then\n *             if self.oclContainer().oclAsType(Kind).fsm &lt;&gt; null\n *             then\n *               self.oclContainer()\n *               .oclAsType(Kind)\n *               .fsm.ownedState.outgoingTransition.action-&gt;includes(self)\n *             else true\n *             endif\n *           else true\n *           endif\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'The action \' + name + \' doesn\\\'t appear in the FSM of \' +\n *               self.oclContainer()\n *               .oclAsType(Kind).name + \' Kind\', severity = 1, quickfix = \'quickfix\'\n *             }\n *           endif\n *       in\n *         \'Action::containedAction\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Action_c_c_containedAction);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_3;\nif (le) {\n\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_2;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Kind_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Kind, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = this.eContainer();\n\t\tfinal /*@Thrown\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Kind_0).booleanValue();\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (oclIsTypeOf) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer_0 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Kind%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_Kind_0));\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.FSM%&gt; fsm = oclAsType.getFsm();\n\t\t\tfinal /*@Thrown\052/ boolean ne = fsm != null;\n\t\t\t/*@Thrown\052/ boolean symbol_0;\n\t\t\tif (ne) {\n\t\t\t\tif (fsm == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::FSM::ownedState\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.State%&gt;&gt; ownedState = fsm.getOwnedState();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_ownedState = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_State, ownedState);\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SEQ_CLSSid_Transition);\n\t\t\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_ownedState.iterator();\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect_0;\n\t\t\t\twhile (true) {\n\t\t\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\t\t\tcollect_0 = accumulator;\n\t\t\t\t\t\tbreak;\n\t\t\t\t\t}\n\t\t\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.State%&gt; _1 = (&lt;%org.eclipse.cmf.occi.core.State%&gt;)ITERATOR__1.next();\n\t\t\t\t\t/**\n\t\t\t\t\t * outgoingTransition\n\t\t\t\t\t \052/\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Transition%&gt;&gt; outgoingTransition = _1.getOutgoingTransition();\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_outgoingTransition = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_Transition, outgoingTransition);\n\t\t\t\t\t//\n\t\t\t\t\tfor (Object value : BOXED_outgoingTransition.flatten().getElements()) {\n\t\t\t\t\t\taccumulator.add(value);\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SEQ_CLSSid_Action);\n\t\t\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1_0 = collect_0.iterator();\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\t\t\t\twhile (true) {\n\t\t\t\t\tif (!ITERATOR__1_0.hasNext()) {\n\t\t\t\t\t\tcollect = accumulator_0;\n\t\t\t\t\t\tbreak;\n\t\t\t\t\t}\n\t\t\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Transition%&gt; _1_0 = (&lt;%org.eclipse.cmf.occi.core.Transition%&gt;)ITERATOR__1_0.next();\n\t\t\t\t\t/**\n\t\t\t\t\t * action\n\t\t\t\t\t \052/\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Action%&gt; action = _1_0.getAction();\n\t\t\t\t\t//\n\t\t\t\t\taccumulator_0.add(action);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(collect, this).booleanValue();\n\t\t\t\tsymbol_0 = includes;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\tstatus = symbol_0;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_2;\n\t\tif (status) {\n\t\t\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_The_32_action_32, name);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_doesn_39_t_32_appear_32_in_32_the_32_FSM_32_of_32);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer_2 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; oclAsType_1 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Kind%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Kind_0));\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_0 = oclAsType_1.getName();\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, name_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_Kind);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.TUPLid__0, sum_2, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_quickfix, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1, status);\n\t\t\tsymbol_2 = symbol_1;\n\t\t}\n\t\tCAUGHT_symbol_2 = symbol_2;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Action_c_c_containedAction, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_3 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_3;'"
	 * @generated
	 */
	boolean containedAction(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv CorrectScheme:\n *   let severity : Integer[1] = \'Action::CorrectScheme\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = let\n *           category : Category[1] = oclContainer()\n *           .oclAsType(Category)\n *         in scheme =\n *           category.scheme.substring(1, category.scheme.size() - 1) + \'/\' + category.term + \'/action#\'\n *       in\n *         \'Action::CorrectScheme\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Action_c_c_CorrectScheme);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Category_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Category, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Category%&gt; category = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Category%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Category_0));\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; scheme_0 = category.getScheme();\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; scheme = this.getScheme();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.string.StringSizeOperation%&gt;.INSTANCE.evaluate(scheme_0);\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%&gt;.INSTANCE.evaluate(size, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1);\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; substring = &lt;%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%&gt;.INSTANCE.evaluate(scheme_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1, diff);\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(substring, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_quot);\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; term = category.getTerm();\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, term);\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__s_action_35);\n\t\tfinal /*@Thrown\052/ boolean eq = scheme.equals(sum_1);\n\t\tCAUGHT_eq = eq;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_eq = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Action_c_c_CorrectScheme, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_eq, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean CorrectScheme(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Action