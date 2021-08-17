package LeetCode;

import java.util.Arrays;

public class SumofSequenceWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3};
		System.out.println(sumSubseqWidths(arr));

	}
	
	public static int sumSubseqWidths(int[] arr) {
       
		Arrays.sort(arr);
		
		int mod = 1000000007;
		long[] power = new long[arr.length];
        power[0] = 1;
        
        for(int i = 1; i<arr.length; i++) {
        	power[i] = (power[i-1] * 2) % mod;
        
        }
        
        long max = 0;
        long min = 0;
        for(int i = 0; i<arr.length; i++) {
        	
        	max = (max + arr[i]*power[i]) % mod;
        	
        	min = (min + arr[i]*power[arr.length - i - 1]) % mod;
        	
        	
        }
        
        return (int)(max - min + mod) % mod;
    }
}
