package pattern_problems;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print('*');
				cst++;
			}
			row += 1;
			System.out.println();
		}

	}

}
