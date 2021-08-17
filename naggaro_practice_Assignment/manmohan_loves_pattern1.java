package naggaro_practice_Assignment;

import java.util.Scanner;

public class manmohan_loves_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		while(row<=n) {
			if(row%2!=0) {
				int cst = 1;
				while(cst<=nst) {
					System.out.print("1");
					cst++;
				}
			}else {
				int cst = 1;
				while(cst<=nst) {
					if(cst == 1 || cst == nst) {
						System.out.print("1");
						cst++;
					}else {
						System.out.print("0");
						cst++;
					}
				}
			}
			nst++;
			row++;
			System.out.println();
		}
	}

}
