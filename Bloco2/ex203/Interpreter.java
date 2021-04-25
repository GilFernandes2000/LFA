public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprUnuaryPos(CalculatorParser.ExprUnuaryPosContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprUnuaryNeg(CalculatorParser.ExprUnuaryNegContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      return visitChildren(ctx);
   }
}
