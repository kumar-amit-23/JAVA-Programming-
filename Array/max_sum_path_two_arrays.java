package Array;

import java.util.Scanner;

public class max_sum_path_two_arrays {
	
	public static int max(int x, int y) { return (x > y) ? x : y; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int test_case = scn.nextInt();
		
		while(test_case>0) {
			
			int n = scn.nextInt();
			int m = scn.nextInt();
			
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			for(int i = 0; i<n; i++) {
				arr1[i] = scn.nextInt();
			}
			for(int i = 0; i<m; i++) {
				arr2[i] = scn.nextInt();
			}
			
			
		}

	}

}
