package LeetCode;

public class MaximumSumIncrSubsequence {

	// Question 6 in the sheet  https://www.geeksforgeeks.org/maximum-sum-increasing-subsequence-dp-14/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,101,2,3,100,4,5};
		
		int[] str = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			str[i] = arr[i];
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<i; j++) {
				if(arr[j] < arr[i]) {
					int jContribution = str[j] + arr[i];
					
					if(jContribution>str[i])
						str[i] = jContribution;
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int val : str) {
			max = Math.max(val, max);
		}
		System.out.println(max);
	
	}
	
	
	

}
