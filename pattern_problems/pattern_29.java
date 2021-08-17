package pattern_problems;

import java.util.Scanner;

public class pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		int nst = 1;
		int nsp = n-1;
		
		int row = 1;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			
			int cst = 1;
			while(cst<=nst) {
				if(cst == 1 || cst == nst) {
					System.out.print(row);
				}else {
					System.out.print("0");
				}
				cst++;
			}
			nst+=2;
			nsp--;
			row++;
			System.out.println();
		}
	}

}
