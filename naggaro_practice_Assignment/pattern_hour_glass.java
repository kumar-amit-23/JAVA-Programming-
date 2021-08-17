package naggaro_practice_Assignment;

import java.util.Scanner;

public class pattern_hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nor = 2*n + 1;
		int nst = 2*n + 1;
		int nsp = 0;
		int row = 1;
		
		while(row<=nor) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			int temp = n + 1 - row;
			while(cst<=nst) {
				if(cst<=nst/2) {
					System.out.print(temp);
					temp--;
				}else {
					System.out.print(temp);
					temp++;
				}
				cst++;
				
		}
			if(row<=nor/2) {
				nsp++;
				nst-=2;
			}else {
				nsp--;
				nst+=2;
			}
			System.out.println();
			row++;
	}

}}
