package pattern_problems;
import java.util.Scanner;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nor = 2*n - 1;
		int row = 1;
		int nst = n;
		int nsp = 0;
		
		while(row<=nor) {
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			if(row<=nor/2) {
				nsp = nsp + 2;
				nst--;
			}else {
				nst++;
				nsp -= 2;
			}
			row++;
			System.out.println();
		}
	}

}
