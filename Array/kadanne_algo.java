package Array;

import java.util.Scanner;

public class kadanne_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i = 0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(kadanes(arr));
	}
	
	public static int kadanes(int[] arr) {
		int sum = arr[0];
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			sum = Math.max(sum + arr[i], arr[i]);
			
			if(sum>max) 
				max = sum;
				
		}
		
		return max;
	}

}
