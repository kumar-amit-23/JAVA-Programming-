package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println(triangles(arr));
	}
	
	public static int triangles(int[] arr) {
		
		Arrays.sort(arr);
		int count = 0;
		
		for(int i = arr.length - 1; i>=1; i--) {
			int l = 0;
			int r = i - 1;
			while(l<r) {
				if(arr[l] + arr[r] > arr[i]) {
					count+= r-l;
					r--;
				}else {
					l++;
				}
			}
		}
		return count;
		
	}

}
