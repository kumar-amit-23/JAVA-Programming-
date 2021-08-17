package pattern_problems;

import java.util.Scanner;

public class pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int row=1;row<=n; row++) {
			
			int val=n;
			
			for (int cst=1;cst<=n;cst++) {
				
				if (cst+row==n+1) {
					System.out.print("*");
					val=val-1;
				}else {
				System.out.print(val);
				val=val-1;
				}
			}
			System.out.println();
	}

}
}
