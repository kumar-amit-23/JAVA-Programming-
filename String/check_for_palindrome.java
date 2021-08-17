package String;

import java.util.Scanner;

public class check_for_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		int i = 0;
		int j = str.length() - 1;
		int count = 0;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
				count++;
			}else {
				System.out.println("not palindrome");
				break;
			}
		}
		
		if(count == str.length()/2) {
			System.out.println("palindome");
		}
	}

}
