

import java.util.*;

public class ex101{
	
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args){
		
		String input = sc.nextLine();
		String vals[] = input.strip().split(" ");
		
		if(vals.length!=3){
			System.err.println("Usage: <Number> <Operator> <Number>");
		}
		
		
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
		System.out.println(result);
	}
}