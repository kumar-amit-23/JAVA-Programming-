package naggaro_practice_Assignment;

import java.util.Scanner;

public class manmohan_loves_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int row = 1;
		int count = 1;
		int nst = 1;
		
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				if(cst == 1 || cst == nst) {
					System.out.print(count + "");
				}else {
					System.out.print("0");
				}
				
				cst++;
			}
			count = row - 1;
			count++;
			nst++;
			row++;
			System.out.println();
			
		}
	}

}
