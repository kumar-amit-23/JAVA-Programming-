package String;

import java.util.Scanner;

public class Upper_case_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		char[] charr = str.toCharArray();
		
		for(int i = 0; i<charr.length; i++) {
			if(i==0) {
				charr[i] = (char)((int)charr[i] - 32);
			}else if(charr[i] == '\0') {
				charr[i + 1] = (char)((int)charr[i] - 32);
			}
		}
		
		System.out.println(charr);

		

	}

}
