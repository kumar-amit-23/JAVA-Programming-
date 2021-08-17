package naggaro_practice_Assignment;

import java.util.Scanner;

public class print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count;
		
		for(int i = 2; i<=n; i++) {
			count = 0;
			for(int j = 2; j<=i/2;j++) {
				if(i%j == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println(i);
		}
		

	}

}
