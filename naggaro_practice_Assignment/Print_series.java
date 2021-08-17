package naggaro_practice_Assignment;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int num = 0;
		int i = 1;
		int count = 0;
		
		while(count<n1  ) {
			num = (3*i) + 2;
			i++;
			if (num % n2 != 0 ) {
				System.out.println(num);
				count ++;
			}
		}

	}

}
