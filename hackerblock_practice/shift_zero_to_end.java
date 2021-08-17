package hackerblock_practice;

import java.util.Scanner;

public class shift_zero_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n = rev(num);
		int count = 0;
		int num1 = 0;
		while(n!=0) {
			int dig = n%10;
			if(dig != 0) {
				 num1 = num1 *10 + dig;
			}else {
				count++;
			}
			n /= 10;
		}
		while(count>0) {
			num1 = num1*10;
			count--;
		}
		System.out.println(num1);

	}
	public static int rev(int n) {
		int n1 = 0;
		while(n!=0) {
			n1 = n1*10 + n%10;
			n /= 10;
		}
		return n1;
	}

}
