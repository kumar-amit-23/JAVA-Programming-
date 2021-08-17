package naggaro_practice_Assignment;

import java.util.Scanner;

public class square_pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nst = 1;
		while(row<=n) {
			int count = 1;
			int cst = 1;
			while(cst<=nst) {
				int temp = (int)Math.pow(count, 2);
				System.out.print(temp + "	");
				count++;
				cst++;
			}
			nst++;
			row++;
			System.out.println();
		}
	}

}
