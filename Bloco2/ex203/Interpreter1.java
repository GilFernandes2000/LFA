public class Interpreter1 extends CalculatorBaseVisitor<Integer> {

   @Override
   public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Integer visitStat(CalculatorParser.StatContext ctx) {
      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override
   public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      return AddSub(visit(ctx.op1), visit(ctx.op2), ctx.op.getText().toCharArray()[0]);
   }

   @Override
   public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.getText());
   }

   @Override
   public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      return MultDivMod(visit(ctx.op1), visit(ctx.op2), ctx.op.getText().toCharArray()[0]);
   }

   public Integer AddSub(int n1, int n2, char op) {
      switch (op) {
      case '+':
         return n1 + n2;
      case '-':
         return n1 - n2;
      default:
         return null;
      }
   }

   public Integer MultDivMod(int n1, int n2, char op) {
      switch (op) {
      case '*':
         return n1 * n2;
      case '/':
         return n1 / n2;
      case '%':
         return n1 % n2;
      default:
         return null;
      }
   }
}
