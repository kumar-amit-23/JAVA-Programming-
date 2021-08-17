package naggaro_practice_Assignment;

import java.util.Scanner;

public class FIbonacci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;
		int count = 0;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(fib(count) + "	");
				count++;
				cst++;
			}
			
			nst++;
			row++;
			System.out.println();
		}
	}

	private static int fib(int count) {
		// TODO Auto-generated method stub
		if(count<=1) {
			return count;
		} 
			
		return fib(count-1) + fib(count - 2);
		
		
	}

}
