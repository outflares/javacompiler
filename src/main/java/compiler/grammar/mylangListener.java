// Generated from D:/BSUIR/3 ����/6 �������/����/compiler examples/compiler-master/src/main/java/compiler/grammar\mylang.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mylangParser}.
 */
public interface mylangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mylangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(mylangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(mylangParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(mylangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(mylangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mylangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mylangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(mylangParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(mylangParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(mylangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(mylangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModMulDiv(mylangParser.ModMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModMulDiv(mylangParser.ModMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(mylangParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(mylangParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim(mylangParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim(mylangParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(mylangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(mylangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExrp(mylangParser.IntExrpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExrp(mylangParser.IntExrpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(mylangParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(mylangParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(mylangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(mylangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(mylangParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(mylangParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(mylangParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(mylangParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(mylangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(mylangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(mylangParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(mylangParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#create_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_int(mylangParser.Create_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#create_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_int(mylangParser.Create_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_int(mylangParser.Create_const_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#create_const_int}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_int(mylangParser.Create_const_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#create_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_float(mylangParser.Create_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#create_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_float(mylangParser.Create_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void enterCreate_const_float(mylangParser.Create_const_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#create_const_float}.
	 * @param ctx the parse tree
	 */
	void exitCreate_const_float(mylangParser.Create_const_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mylangParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectInt(mylangParser.NameObjectIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mylangParser#name_object_int}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectInt(mylangParser.NameObjectIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mylangParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectFloat(mylangParser.NameObjectFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mylangParser#name_object_float}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectFloat(mylangParser.NameObjectFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(mylangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(mylangParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(mylangParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(mylangParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(mylangParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(mylangParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(mylangParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(mylangParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(mylangParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(mylangParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mylangParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void enterForCond(mylangParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mylangParser#condition_for}.
	 * @param ctx the parse tree
	 */
	void exitForCond(mylangParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(mylangParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(mylangParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(mylangParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(mylangParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(mylangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(mylangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(mylangParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(mylangParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintInt(mylangParser.PrintIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintInt(mylangParser.PrintIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintFloat(mylangParser.PrintFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintFloat(mylangParser.PrintFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPretty_print(mylangParser.Pretty_printContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPretty_print(mylangParser.Pretty_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(mylangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(mylangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(mylangParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(mylangParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(mylangParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(mylangParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(mylangParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(mylangParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(mylangParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(mylangParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(mylangParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(mylangParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(mylangParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(mylangParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(mylangParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(mylangParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(mylangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(mylangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(mylangParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(mylangParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(mylangParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(mylangParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mylangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mylangParser.TypeContext ctx);
}