package naggaro_practice_Assignment;

import java.util.Scanner;

public class Mountain_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n+1;
		int row = 1;
		
		while(row<=n) {
			int cst = 1;
			int count = 1;
			while(cst<=nst) {
				System.out.print(count + "	" );
				cst++;
				count++;
			}
			
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst1 = 1;
			int count1 = count -1;
			while(cst1<=nst) {
				if(count1!=n) {System.out.print(count1 + "	");}
				cst1++;
				count1--;
			}
			row++;
			nsp-=2;
			nst++;
			System.out.println();
		}
	}

}
