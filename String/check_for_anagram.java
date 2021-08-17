package String;

import java.util.Arrays;
import java.util.Scanner;

public class check_for_anagram {
	
	public static void main(String arg[]) {
		 Scanner scn = new Scanner(System.in);
		 char[] cha = new char[26];
		 String str1 = scn.next();
		 String str2 = scn.next();
		 
		 for(int i = 0; i<str1.length(); i++) {
			 cha[((int)str1.charAt(i) - 97)] += 1;
		 }
		 
		 for(int i = 0; i<str2.length(); i++) {
			 cha[((int)str2.charAt(i) - 97)] -= 1;
		 }
		 
		 Arrays.sort(cha);
		 
		 if(cha[cha.length - 1] == 0 ) {
			 System.out.println("True");
		 }else {
			 System.out.println("False");
		 }
		 
		 
	}

}
