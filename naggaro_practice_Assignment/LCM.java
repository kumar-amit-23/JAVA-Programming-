package naggaro_practice_Assignment;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int n1 = scn.nextInt();
		int gcd = 1;
		
		if (n1<0)
			n1 = -n1;
		if(n<0)
			n = -n;
		
		for(int i = 1; i<=n && i<=n1;++i) {
			if(n%i==0 && n1%i == 0) {
				gcd = i;
			}
		}
		int lcm = (n*n1)/gcd;
		System.out.println(lcm);

	}

}
