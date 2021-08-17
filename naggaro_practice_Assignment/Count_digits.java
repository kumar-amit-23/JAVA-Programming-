package naggaro_practice_Assignment;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int dig = scn.nextInt();
		int count = 0;
		if (n<0)
			n = -n;
		while(n>0) {
			if (n%10 == dig) {
				count +=1;
				
			}
			n = n/10;
		}
		System.out.println(count);

	}

}
