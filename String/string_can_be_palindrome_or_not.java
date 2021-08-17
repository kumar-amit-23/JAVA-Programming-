package String;

import java.util.Arrays;
import java.util.Scanner;

public class string_can_be_palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		char cha[] = new char[26];
		
		
			for(int i = 0;  i<str.length(); i++) {
				cha[((int)str.charAt(i) - 97)] += 1;
			}
			
			//Arrays.sort(cha);
			
			int count = 0;
			for(int i = 0; i<cha.length; i++) {
				if(cha[i] == 1)
					count++;
			}
			if(count > 1) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		
		
		

	}

}
