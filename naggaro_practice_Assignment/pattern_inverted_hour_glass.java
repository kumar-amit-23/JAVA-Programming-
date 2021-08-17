package naggaro_practice_Assignment;

import java.util.Scanner;

public class pattern_inverted_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int nst = 1;
		int nor = 2*n + 1;
		
		int nsp = 2*n-1;
		int row = 1;
		while(row<=nor) {
			int temp = n;
			int cst = 1;
			while(cst<=nst) {
				System.out.print(temp );
				temp--;
				cst++;
			}
			if(row!=n) {int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}}
			int cst1 = 1;
			int temp1 = temp;
			while(cst1<=nst) {
				 {System.out.print(temp1 );}
				temp1++;
				cst1++;
			}
			
			if(row<nor/2) {
				nst++;
				nsp-=2;
			}else {
				nst--;
				nsp+=2;
			}
			row++;
			System.out.println();
			
		}
	}

}
