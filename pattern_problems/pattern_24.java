package pattern_problems;

import java.util.Scanner;

public class pattern_24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n -1;
		int nst = 1;
		int row = 1;
		int count = 1;
		
		while(row<=n) {
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print(count);
				
				cst++;
			}
			count++;
			nsp--;
			nst+=2;
			row++;
			System.out.println();
		}
	}

}
