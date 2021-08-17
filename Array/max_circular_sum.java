package Array;

import java.util.Scanner;

public class max_circular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = scn.nextInt();
		}
		int ans1 = MaxSubArraySumUsing2Loops(arr);
		
		int sum = 0;
		
		for(int i = 0; i<n;i++) {
			sum += arr[i];
		}
		
		for(int i = 0; i<n; i++) {
			arr[i] = -arr[i];
		}
		
		int var = MaxSubArraySumUsing2Loops(arr);
		
		int ans2 = sum - (-var);
		
		if(ans1>ans2){
            System.out.println(ans1);
        }else{
            System.out.println(ans2);
        }
		
		
		
		

	}
	
	public static int MaxSubArraySumUsing2Loops(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int si = 0; si<arr.length;si++) {
			int sum = 0;
			for(int ei = si;ei<arr.length;ei++) {	
				sum = sum + arr[ei];
				if(sum>max) {
					max = sum;
				}
			}			
		}
		return max;
		
		
	}

}
