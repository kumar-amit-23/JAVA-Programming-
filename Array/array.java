package Array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        
        
        TargetSumPair(arr, target);

	}
	
	 public static void TargetSumPair(int[] arr, int target){
	        int i = 0;
	        int j = arr.length - 1;

	        while(i<j){
	            if(arr[i] + arr[j] < target){
	                i++;
	            }else if(arr[i] + arr[j] > target){
	                j--;
	            }else{
	                System.out.println(arr[i] + "and" + arr[j]);
	                i++;
	                j--;
	            }
	        }
	    }

}
