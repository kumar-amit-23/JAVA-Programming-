package naggaro_practice_Assignment;

import java.util.Scanner;

public class calculator2 {
	static Scanner scn = new Scanner(System.in); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		do {
			ch = scn.next().charAt(0);
			if (ch == 'X' || ch == 'x' ) {
				
				//break;
			}
			else if (ch == '*' || ch == '+' || ch == '-' || ch == '/' || ch == '%'  ) {
				System.out.println(operation(ch));				
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
		}while(ch != 'x' || ch != 'X');
		

	}
	 static int operation (char ch) {
		int n = scn.nextInt();
		int n2 = scn.nextInt();
		
		
		
		switch(ch) {
			case '+':
				return n + n2;
				//System.out.println(result);
				
			case '*':
				return n * n2;
				
			case '-':
				return n-n2;
				
			case '/':
				return n/n2;
				
			case '%':
				return n%n2;
				
		
	}
		return -1;

}}
