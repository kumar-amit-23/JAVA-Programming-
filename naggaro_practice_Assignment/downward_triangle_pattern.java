package naggaro_practice_Assignment;

import java.util.Scanner;

public class downward_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nst = n;
		int nsp = 0;
		
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			nst--;
			nsp++;
			System.out.println();
		}

	}

}
