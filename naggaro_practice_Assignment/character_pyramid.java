package naggaro_practice_Assignment;

import java.util.Scanner;

public class character_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1;
		char count = 'a';
		//System.out.println((int)count);
		
		int row = 1;
		
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(count + " ");
				count += 2;
				cst++;
			}
			count = 'a';
			row++;
			if(row%2==0) {
				count++;
			}
			
			nst++;
			System.out.println();
		
		}
	}

}
