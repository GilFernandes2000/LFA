
import java.util.*;
import java.lang.*;

public class ex103{

	public static void main(String[] args){

		assert args.length > 0: "Nothing to work with";
		Stack<Double> pilha = new Stack<>();

		for(int i = 0; i < args.length; i++){
			char c = args[i].charAt(0);
			if(Character.isDigit(c)){
				double num1 = Double.parseDouble(args[i]);
				pilha.push(num1);
				System.out.println(pilha.toString());
			}
			else{
				if(pilha.size() < 2){
					System.out.println("Cant do any more operations");
					System.out.printf("Final Operator was: %s\n", args[i--]);
					System.out.println("Discarding left operators...");
					System.exit(0);
				}
				else{
					String n1 = pilha.pop().toString();
					String n2 = pilha.pop().toString();
					String[] conta = {n1, args[i], n2};
					double res = Operation(conta);
					pilha.push(res);
					System.out.println(pilha.toString());
				}
			}
		}
	}

	public static double Operation(String[] vals) {

		char op = vals[1].charAt(0);

		if(op!='+' && op!='*' && op!='-' && op!='/'){
			System.err.println("Usage: +, *, -, /");
		}
		double num1 = Double.parseDouble(vals[0]);
		double num2 = Double.parseDouble(vals[2]);
		double result = 0;
		
		switch(op){
			case '+':
				result = num1 + num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
			case '-':
				result = num1 - num2;
				break;
				
			case '/':
				result = num1 / num2;
		}
		return result;
	}
}