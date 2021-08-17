package naggaro_practice_Assignment;

import java.util.Scanner;

public class nth_fibonaaci {
	
	static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fib(n));
		

	}

}
