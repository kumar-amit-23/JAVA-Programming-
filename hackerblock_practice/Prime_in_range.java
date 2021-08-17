package hackerblock_practice;

import java.util.Scanner;

public class Prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test_case = scn.nextInt();
		while(test_case!=0) {
			int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int count = 0;
			
			while(n1<=n2) {
				if (isprime(n1)) {
					count++;
				}
				n1++;
			}
			test_case--;
			System.out.println(count);
		}

	}

	private static boolean isprime(int n1) {
		// TODO Auto-generated method stub
		int countt = 0;
		if (n1 == 1) {
			return false;
		}else if (n1 == 2) {
			return true;
		}else {
		for (int i = 2; i<=n1/2;i++) {
			if(n1%i==0) {
				countt++;
				break;
			}
		}
		if (countt == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}}
