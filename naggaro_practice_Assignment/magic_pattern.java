package naggaro_practice_Assignment;

import java.util.Scanner;

public class magic_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = -1;
		int rows = 1;
		while (rows <= 2 * n - 1) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			if (rows == 1 || rows == 2 * n - 1) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if (rows < n) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}
			rows++;
		}
	}

}
