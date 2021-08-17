package naggaro_practice_Assignment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int reversed = 0;
		
		while(n>0) {
			int dig = n%10;
			reversed = reversed*10 + dig;
			n = n/10;
		}
		System.out.println(reversed);
	}

}
