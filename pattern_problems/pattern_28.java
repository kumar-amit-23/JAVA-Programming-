package pattern_problems;

import java.util.Scanner;

public class pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1;
		int nsp = n-1;
		int row = 1;
		
		//int count = 1;
		
		while(row<=n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int count = row;
			int cst = 1;
			while(cst<=nst) {
				System.out.print(count);
				if(cst<=nst/2) {
					count++;
				}else {
					count--;
				}
				cst++;
			}
			nst+=2;
			nsp--;
			row++;
			count++;
			System.out.println();
		}
	}

}
