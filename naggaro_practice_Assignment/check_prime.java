package naggaro_practice_Assignment;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int count = 0;
		
		for (int i =2;i<n;i++) {
			if(n %i == 0) {
				count += 1;
				break;
			}
		}
		if (count == 0)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime"); 
				

	}

}
