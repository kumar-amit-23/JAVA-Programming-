package hackerblock_practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int n = num;
		int rev =0;
		while(num>0) {
			int dig = num%10;
			rev = rev*10 + dig;
			num /=10;
		}
		System.out.println(rev);
		if(n == rev) {
			System.out.println("it is palindrome");
		}else{
			System.out.println("it is not palindome");
		}
	}

}
