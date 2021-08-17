package String;

import java.util.Scanner;

public class String_Builder {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		StringBuilder sb = new StringBuilder(str);
		
		//StringBuilder sb = new StringBuilder("hello");
		
		System.out.println(sb.length());
		System.out.println(sb);
		
		System.out.println(sb.charAt(2));
		
		
		sb.setCharAt(1, 'o');
		System.out.println(sb);
	
		sb.insert(sb.length(), "bye");
		System.out.println(sb);
		sb.append("code");
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
	}

}
