package pattern_problems;

import java.util.Scanner;

public class pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n;
		int row = 1;
		while(row<=n) {
			int cst = 1;
			int count = n;
			while(cst<=nst) {
				System.out.print(count + " ");
				count--;
				cst++;
			}
			row++;
			System.out.println();
		}
	}

}
