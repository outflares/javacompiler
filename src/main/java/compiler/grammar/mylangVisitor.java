// Generated from D:/BSUIR/3 курс/6 семестр/яѕ»—/compiler examples/compiler-master/src/main/java/compiler/grammar\mylang.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mylangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mylangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mylangParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(mylangParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(mylangParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mylangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(mylangParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(mylangParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(mylangParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(mylangParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prim}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(mylangParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(mylangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExrp}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExrp(mylangParser.IntExrpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(mylangParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(mylangParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(mylangParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(mylangParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link mylangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(mylangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(mylangParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#create_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_int(mylangParser.Create_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#create_const_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_int(mylangParser.Create_const_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#create_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_float(mylangParser.Create_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#create_const_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_const_float(mylangParser.Create_const_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectInt}
	 * labeled alternative in {@link mylangParser#name_object_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectInt(mylangParser.NameObjectIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectFloat}
	 * labeled alternative in {@link mylangParser#name_object_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectFloat(mylangParser.NameObjectFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(mylangParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(mylangParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(mylangParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(mylangParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(mylangParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCond}
	 * labeled alternative in {@link mylangParser#condition_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(mylangParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(mylangParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkType}
	 * labeled alternative in {@link mylangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(mylangParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(mylangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(mylangParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printInt}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(mylangParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFloat}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFloat(mylangParser.PrintFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pretty_print}
	 * labeled alternative in {@link mylangParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPretty_print(mylangParser.Pretty_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(mylangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(mylangParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(mylangParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link mylangParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(mylangParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(mylangParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link mylangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(mylangParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(mylangParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(mylangParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(mylangParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(mylangParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link mylangParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(mylangParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mylangParser.TypeContext ctx);
}