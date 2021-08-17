package naggaro_practice_Assignment;
import java.math.*;

import java.util.Scanner;

public class Replace_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long numb = scn.nextLong();
		long ans = 0L;
		long prod = 1L;
		if(numb == 0) {
			System.out.println(5);
		}
		else {
			while(numb>0) {
				int a = (int)(numb%10);
				if(a==0) {
					ans+=5*prod;
				}
				else {
					ans+=a*prod;
				}
				prod *= 10;
				numb /= 10;
			}
			System.out.println(ans);
		}
	}

}
