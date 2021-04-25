// Generated from PreffixCalculator.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PreffixCalculatorParser}.
 */
public interface PreffixCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PreffixCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PreffixCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreffixCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PreffixCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreffixCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PreffixCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreffixCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PreffixCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCalc}
	 * labeled alternative in {@link PreffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCalc(PreffixCalculatorParser.ExprCalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCalc}
	 * labeled alternative in {@link PreffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCalc(PreffixCalculatorParser.ExprCalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link PreffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(PreffixCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link PreffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(PreffixCalculatorParser.ExprIntegerContext ctx);
}