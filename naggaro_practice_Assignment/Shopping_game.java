package naggaro_practice_Assignment;

import java.util.Scanner;

public class Shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test_case = scn.nextInt();
		while(test_case>0) {
		int N = scn.nextInt();
		int M = scn.nextInt();
		int AS = 0;
		int HS = 0;
		int count = 1;
		while(AS<=N && HS<=M){
		if (count%2!=0) {
			AS = AS + count;
			//System.out.println(AS);
		}
		else {
			HS += count;
			//System.out.println(HS);
		}
		count ++;
		
		
	}
	if (HS>M) {
		System.out.println("Aayush");
	}
	else if(AS>N) {
		System.out.println("Harshit");
	
	}
	
	}
		test_case--;

}
}
