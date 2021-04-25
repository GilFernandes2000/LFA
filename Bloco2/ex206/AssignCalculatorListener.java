// Generated from AssignCalculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssignCalculatorParser}.
 */
public interface AssignCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssignCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AssignCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AssignCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AssignCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AssignCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssignCalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AssignCalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssignCalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AssignCalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(AssignCalculatorParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(AssignCalculatorParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOP}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOP(AssignCalculatorParser.ExprOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOP}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOP(AssignCalculatorParser.ExprOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(AssignCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(AssignCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(AssignCalculatorParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link AssignCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(AssignCalculatorParser.ExprIDContext ctx);
}