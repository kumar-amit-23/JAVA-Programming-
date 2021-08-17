package hackerblock_practice;

import java.util.Scanner;
import java.lang.Math;

public class compute_F_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test_case = scn.nextInt();
		while(test_case-->0) {
			double n = scn.nextInt();
			System.out.println(Math.round((sum(n))));
		}

	}

	private static double sum(double n) {
		// TODO Auto-generated method stub
		double add = 0;
		for(double i = 1;i<=n;i++) {		
			add = add + (Math.pow(-1, i))*i;
		}
		return add;
	}

}
