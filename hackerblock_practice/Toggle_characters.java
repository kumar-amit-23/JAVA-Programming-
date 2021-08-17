package hackerblock_practice;

import java.util.Scanner;

public class Toggle_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		char str1[] = str.toCharArray(); 
		for(int i = 0;i<str1.length;i++) {
			if(str1[i]>='A' && str1[i]<='Z') {
				str1[i] = (char)((int) str1[i] + 32);
			}else {
				str1[i] = (char)((int)str1[i] - 32);
			}
		}
		for (int j = 0;j<str1.length;j++) {
			System.out.print(str1[j]);
		}
		//System.out.println(str.toCharArray());

	}

}
