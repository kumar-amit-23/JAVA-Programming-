package class_practice;

import java.util.Scanner;

public class araay_reverse {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] arg) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int  i = 0 ; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		//reverse(arr,arr.length);
		rotate(arr);
		
	}

	private static void rotate(int[] arr) {
		// TODO Auto-generated method stub
		int rot = scn.nextInt();
		rot = rot % arr.length;
		for(int i = 0;i<arr.length;i++) {
			if(i<rot) {
				System.out.print(arr[arr.length + i - rot] + ", ");
			}else {
				System.out.print(arr[i-rot] + ", ");
			}
		}
		
	}

	private static void reverse(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = n-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(i = 0 ; i<arr.length;i++) {
			//arr[i] = scn.nextInt();
			System.out.print(arr[i] + ", ");
		}
	}

}
