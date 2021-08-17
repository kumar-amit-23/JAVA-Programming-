package naggaro_practice_Assignment;

import java.util.Scanner;

public class armstrog_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		for(int i = n1;i<=n2;i++) {
			int arm = check_armstrong(i);
			if(i == arm) {
				System.out.println(arm);
			}
		}
	}
	public static int check_armstrong(int a) {
		int num = a;
		int temp = a;
		int count = 0;
		int temp1 = 0;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		while(num!=0) {
			int dig = num%10;
			temp1 += (int)Math.pow(dig, count);
			num /= 10;
		}
		//System.out.println(temp1);
		return temp1;
	}

}
