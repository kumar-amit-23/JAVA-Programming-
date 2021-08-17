package naggaro_practice_Assignment;

import java.util.Scanner;

public class number_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nor = 2*n - 1;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		
		int temp = 1;
		while(row<=nor) {
			int count = temp;
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst<=nst) {
				if(cst<=nst/2) {
					System.out.print(count + " ");
					count++;
				}else {
					System.out.print(count + " ");
					count--;
				}
				//System.out.print(count + " ");
				cst++;
			}
			
			if(row<=nor/2) {
				nst+=2;
				nsp--;
				temp++;
			}else {
				nst-=2;
				nsp++;
				temp--;
			}
			System.out.println();
			row++;
		}
	}

}
