package naggaro_practice_Assignment;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n1 = scn.nextInt();
		if (n>0)
			n = n;
		else
			n = -n;
		if (n1>0)
			n1 = n1;
		else
			n1 = -n1;
		int gcd = 1;
		for ( int i = 1; i<= n && i<=n1; i++) {
			if(n % i == 0 && n1 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);

	}

}
