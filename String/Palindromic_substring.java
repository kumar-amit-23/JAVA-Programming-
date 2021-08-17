package String;

import java.util.Scanner;

public class Palindromic_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int count_odd = 0;
		int count_even = 0;
		// odd length
		
		for(int axis = 0; axis<str.length(); axis++) {
			for(int orbit = 0; axis - orbit>=0 && axis+orbit <str.length(); orbit++) {
				if(str.charAt(axis-orbit) == str.charAt(axis + orbit)) {
					count_odd++;
				}else {
					break;
				}
			}
		}
		
		System.out.println(count_odd);
		
		//even length
		
		for(double axis = 0.5; axis<str.length(); axis++) {
			for(double orbit = 0.5; axis - orbit>=0 && axis+orbit <str.length(); orbit++) {
				if(str.charAt((int) (axis-orbit)) == str.charAt((int) (axis + orbit))) {
					count_even++;
				}else {
					break;
				}
			}
		}
		
		System.out.println(count_even);
	}

}
