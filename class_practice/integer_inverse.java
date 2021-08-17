package class_practice;

import java.util.Scanner;
import java.math.*;

public class integer_inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 0;
		int ans= 0;
		while(num!=0) {
			count++;
			int dig = num%10;
			ans = ans + count*(int)Math.pow(10, dig-1);
			num /=10;
		}
		System.out.println(ans);


	}

}
