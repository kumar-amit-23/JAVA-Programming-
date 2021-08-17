package pattern_problems;

import java.util.Scanner;

public class pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int cor = 2*n - 1;
		int row = 1;
		int nst = 1;
		
		while(row<=cor) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<=cor/2) {
				nst++;
			}else {
				nst--;
			}
			row++;
		}
	}

}
