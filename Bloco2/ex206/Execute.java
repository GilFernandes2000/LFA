import java.util.*;

public class Execute extends AssignCalculatorBaseVisitor<Integer> {

   Map<String, Integer> map = new HashMap<>();

   @Override
   public Integer visitProgram(AssignCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Integer visitStat(AssignCalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         System.out.println(visit(ctx.expr()));
         return null;
      } else if (ctx.assign() != null) {
         visit(ctx.assign());
         return null;
      }
      return null;
   }

   @Override
   public Integer visitAssign(AssignCalculatorParser.AssignContext ctx) {
      map.put(ctx.ID().getText(), visit(ctx.expr()));
      return null;
   }

   @Override
   public Integer visitExprAddSub(AssignCalculatorParser.ExprAddSubContext ctx) {
      return doMath(visit(ctx.num1), visit(ctx.num2), ctx.op.getText());
   }

   @Override
   public Integer visitExprParent(AssignCalculatorParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Integer visitExprInteger(AssignCalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.getText());
   }

   @Override
   public Integer visitExprID(AssignCalculatorParser.ExprIDContext ctx) {
      String s = ctx.ID().getText();

      if (map.containsKey(s)) {
         return map.get(s);
      }
      return null;
   }

   @Override
   public Integer visitExprMultDivMod(AssignCalculatorParser.ExprMultDivModContext ctx) {
      return doMath(visit(ctx.num1), visit(ctx.num2), ctx.op.getText());
   }

   public Integer doMath(int n1, int n2, String op) {
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
