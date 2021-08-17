package naggaro_practice_Assignment;

import java.util.Scanner;

public class hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n - 1;
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			 
				if(row==1 || row==n) {
					while(cst<=nst) {
						System.out.print("*");
						cst++;
					}
				}else {//cst = 1;
					while(cst<=nst) {
						if(cst == 1 || cst == nst) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						cst++;
					}
				}
				
					
					
				
			
			nsp--;
			row++;
			System.out.println();
		}
	}

}
