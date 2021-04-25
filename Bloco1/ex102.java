

import java.util.*;

public class ex102
{
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args){
		HashMap<String,Double> map = new HashMap<>();
		
		while(true) {
			String input = sc.nextLine();
			String vals[] = input.strip().split(" ");
			
			if(vals.length!=3 && vals.length!=5){
				System.err.println("Usage: <Number> <Operator> <Number>");
				System.err.println("Usage: <Variable> = <Number>");
				System.err.println("Usage: <Variable> = <Variable> <Operator> <Number>");
			}
			
			if(vals.length == 3) {
				char n1 = vals[0].charAt(0);
				char op = vals[1].charAt(0);
				char n2 = vals[2].charAt(0);
				if(Character.isLetter(n1)) {
					if(Character.isDigit(n2)){
						if(op == '=') {
							double num2 = Double.parseDouble(vals[2]);
							map.put(vals[0], num2);
						}
						else {
							String n = map.get(vals[0]).toString();
							String[] conta = {n, vals[1], vals[2]};
							double res = Operation(conta);
							map.put(vals[0], res);
							System.out.println(res);
						}
					}
					else{
						vals[0] = map.get(vals[0]).toString();
						vals[2] = map.get(vals[2]).toString();
						double res = Operation(vals);
						System.out.println(res);
					}
				}
				
				else {
					double res = Operation(vals);
					System.out.println(res);
				}
			}

			if(vals.length == 5){
				char n1 = vals[0].charAt(0);
				char op = vals[1].charAt(0);
				if(Character.isLetter(n1) && op == '='){
					String num = map.get(vals[2]).toString();
					String[] conta = {num, vals[3], vals[4]};
					double res = Operation(conta);
					map.put(vals[0],res);
					System.out.printf("%s = %.2f\n",vals[0], map.get(vals[0]));
				}	
			}
		}
	}
	
	public static double Operation(String[] vals) {
		char n1 = vals[0].charAt(0);
		char op = vals[1].charAt(0);
		char n2 = vals[2].charAt(0);
		
		if(!Character.isDigit(n1) || Character.isDigit(op) || !Character.isDigit(n2)){
			System.err.println("Usage: <Number> <Operator> <Number>");
		}
		
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
