package Array;

import java.util.Scanner;

public class Binary_Search {

	
		public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i<n; i++){
	            arr[i] = scn.nextInt();
	        }
	        int target = scn.nextInt();
	        System.out.println(binarySearch(arr, target));

	    }
	    public static int binarySearch(int[] arr, int target){
	        int lo = 0;
	        int hi = arr.length - 1;

	        while(lo<hi){
	            int mid = (lo+hi)/2;
	            if(arr[mid]<target){
	                lo = mid + 1;
	            }else if(arr[mid]> target){
	                hi = mid - 1;
	            }else{
	                return mid;
	            }
	        }

	        return -1;
	    }
	}


