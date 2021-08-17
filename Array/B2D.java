package Array;

import java.util.Scanner;

public class B2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		while(n!=0) {
			int num = scn.nextInt();
			int count = 0;
			int ans = 0;
			while(num!=0) {
				int rem = num % 10;
				ans = ans + rem*count;
				count++;
				num/=10;
			}
			System.out.println(ans);
			n--;
		}

	}

}
