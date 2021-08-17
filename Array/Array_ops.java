package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int arr[] = {-8,8,-9,9,-10,11,-12};
		
		//int arr2[] = {0,0,0,0,0};
		//Inverse(arr);
		//BarGraph(arr);
		//PrintSubArray(arr);
		//SumofSubArray(arr);
		MaxSubArraySumUsing2Loops(arr);
		//TargetSumPair(arr, 100);
		
		//TargetSumTriplet(arr, 120);
		
		
	}
	public static void MaxSubArraySumUsing2Loops(int[] arr) {
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
		System.out.println(max);
		
		
	}
	public static void SubArraySumUsing2Loops(int[] arr) {
		for(int si = 0; si<arr.length;si++) {
			int sum = 0;
			for(int ei = si;ei<arr.length;ei++) {	
				sum = sum + arr[ei];
				System.out.println(si + "," + ei + " :-" + sum);
			}			
		}
		
		
	}
	public static void display(int [] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
	}
	public static void BarGraph(int[] arr) {
		// TODO Auto-generated method stub
		int row = maximum(arr);
		int col = arr.length;
		
		for(int r = 1; r <= row; r++ ) {
			for(int c = 0; c<col;c++) {
				if(r <= row - arr[c]) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
	public static int maximum(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void Inverse(int[] arr) {
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int temp = 0;
			temp = arr[i];
			arr2[temp] = i;
		}
		
		for(int j = 0; j<arr.length;j++) {
			System.out.print(arr2[j] + ", ");
		}
	}
	
	public static void PrintSubArray(int[] arr) {
		for(int si = 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {
				//System.out.println(si + "" + ei);
				
				for(int k = si; k<=ei;k++) {
					System.out.print(arr[k]);					
				}				
				System.out.println();
			}			
		}
		
	}
	
	public static void SumofSubArray(int[] arr) {
		
		for(int si = 0; si<arr.length;si++) {
			for(int ei = si;ei<arr.length;ei++) {				
				int sum = 0;
				for(int k = si; k<=ei;k++) {					
					sum = sum + arr[k];
				}
				System.out.println(sum);				
			}			
		}
	}
	
	public static void TargetSumPair(int[] arr, int target) {
		int i = 0;
		int j = arr.length - 1;
		
		Arrays.sort(arr);
		
		while(i<j) {
			if(arr[i] + arr[j]>target) 
				j--;
			else if(arr[i] + arr[j]<target)
				i++;
			else {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			}
		}
	}
	
	public static void TargetSumTriplet(int[] arr, int target) {
		for(int i = 0; i<arr.length; i++) {
			int j = i  + 1;
			int k = arr.length - 1;
			
			while(j<k) {
				if(arr[j] + arr[k] > target - arr[i]) {
					k--;
				}else if(arr[j] + arr[k] < target - arr[i]) {
					j++;
				}else {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					j++;
					k--;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	


}
