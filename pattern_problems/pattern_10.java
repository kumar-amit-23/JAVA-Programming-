package pattern_problems;

import java.util.Scanner;

public class pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp = 0;
		int nst = 2*n - 1;
		while(row<=n) {
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			nsp++;
			nst = nst - 2;
			row++;
			System.out.println();
		}

	}

}
