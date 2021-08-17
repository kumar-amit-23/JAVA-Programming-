package naggaro_practice_Assignment;

import java.util.Scanner;

public class odd_even_places {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long c = 1L;
		long odd = 0L ;
		long even = 0L;
		//long num = reverse(n);
		while(n != 0) {
			//long dig = num / 10;
			if (c % 2 == 0) {
				even = even + n % 10;
			}
			else {
				odd = odd + n%10;
			}
			n = n/10;
			c++;
			
		}
		System.out.println(odd);
		System.out.println(even);
		

	}

	
}
