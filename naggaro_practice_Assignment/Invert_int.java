package naggaro_practice_Assignment;

import java.util.Scanner;

public class Invert_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String num = cin.next();
		for(int i = 0; i < num.length(); ++i){
			if(i==0){
				if('5' <= num.charAt(0) && num.charAt(0) <= '8')
					System.out.print((char)('0' + 9 - num.charAt(0) + '0'));
				else
					System.out.print(num.charAt(0));
			}
			else{
				if('5' <= num.charAt(i) && num.charAt(i) <= '9')
					System.out.print((char)('0' + 9 - num.charAt(i) + '0'));
				else
					System.out.print(num.charAt(i));
			}
		}
		
	}

}
