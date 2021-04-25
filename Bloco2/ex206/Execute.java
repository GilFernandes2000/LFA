import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Execute extends AssignCalculatorBaseVisitor<Double> {

   private Map<String, Double> map = new HashMap<>();

   @Override
   public Double visitProgram(AssignCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Double visitStat(AssignCalculatorParser.StatContext ctx) {
      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override
   public Double visitAssign(AssignCalculatorParser.AssignContext ctx) {
      return map.put(ctx.ID().getText(), visit(ctx.num));
   }

   @Override
   public Double visitExprParent(AssignCalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Double visitExprOP(AssignCalculatorParser.ExprOPContext ctx) {
      return doMath(visit(ctx.num1), visit(ctx.num2), ctx.op.getText());
   }

   @Override
   public Double visitExprInteger(AssignCalculatorParser.ExprIntegerContext ctx) {
      return Double.parseDouble(ctx.getText());
   }

   @Override
   public Double visitExprID(AssignCalculatorParser.ExprIDContext ctx) {
      String s = ctx.getText();
      Set<String> keys = map.keySet();
      if (keys.contains(s)) {
         return map.get(s);
      }
      return null;
   }

   public Double doMath(double n1, double n2, String op) {
      switch (op) {
      case "+":
         return n1 + n2;
      case "-":
         return n1 - n2;
      case "*":
         return n1 * n2;
      case "/":
         return n1 / n2;
      case "%":
         return n1 % n2;
      default:
         return null;
      }
   }
}
