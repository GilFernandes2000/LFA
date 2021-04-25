public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override
   
   public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   
   @Override
   public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      System.out.println(visit(ctx.expr()));
      return null;
   }
   

   @Override
   public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.getText());
   }
   

   @Override
   public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      return doMath(visit(ctx.op1), visit(ctx.op2), ctx.op.getText().toCharArray()[0]);
   }

   // Função para associar os operadores

   public Double doMath(double n1, double n2, char op) {
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
