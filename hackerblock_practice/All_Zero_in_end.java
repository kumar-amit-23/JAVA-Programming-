package hackerblock_practice;

import java.util.Scanner;

public class All_Zero_in_end {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int T = scn.nextInt();
		 int N;
		 for(int i = 0;i<T && scn.hasNextInt(); ++i) {
			 N = scn.nextInt();
			 System.out.println(Count(N));
		 }
		
	}
	public static int Count(int num) {
		int res = 1;
		for(int i = 0;i<num;++i) {
			res = (res<<1)%100000;
		}
		return res-1;
	}

}
