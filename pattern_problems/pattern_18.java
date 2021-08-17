package pattern_problems;

import java.util.Scanner;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n/2;
		while(row<=n) {
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst<= nst) {
				System.out.print("*");
				cst++;
			}
			
			if(row<=n/2) {
				nst += 2;
				nsp--;
			}else {
				nst -= 2;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}
