public class Interpreter extends PreffixCalculatorBaseVisitor<Integer> {

   @Override
   public Integer visitProgram(PreffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Integer visitStat(PreffixCalculatorParser.StatContext ctx) {
      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override
   public Integer visitExprCalc(PreffixCalculatorParser.ExprCalcContext ctx) {
      return doMath(visit(ctx.op1), visit(ctx.op2), ctx.op.getText().toCharArray()[0]);
   }

   @Override
   public Integer visitExprInteger(PreffixCalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.getText());
   }

   public Integer doMath(int n1, int n2, char op) {
      switch (op) {
      case '+':
         return n1 + n2;
      case '-':
         return n1 - n2;
      case '*':
         return n1 * n2;
      case '/':
         return n1 / n2;
      default:
         return null;
      }
   }
}
