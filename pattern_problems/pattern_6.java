package pattern_problems;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = 0;
		int nst = n;
		
		int row = 1;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			nsp += 2;
			nst--;
			row++;
			System.out.println();
		}
	}

}
