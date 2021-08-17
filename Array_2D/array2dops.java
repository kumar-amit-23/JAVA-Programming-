package Array_2D;

import java.util.Scanner;

public class array2dops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = takeinput();
		display(a);
		System.out.println("--WAVE DISPLAY--");
		wavedisplay(a);
	}
	public static int[][] takeinput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r = scn.nextInt();
		System.out.println("enter no of columns");
		int c = scn.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		return arr;
	}
	public static  void display(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}
	}
	
	public static void wavedisplay(int[][] arr) {
		for(int c = 0; c<arr[0].length; c++) {
			if(c%2==0) {
				for(int r = 0; r<arr.length; r++) {
					System.out.print(arr[r][c] + "	");
				}
			}else {
				for(int r = arr.length - 1; r>=0; r--) {
					System.out.print(arr[r][c] + "	");
				}
			}
			System.out.println();
		}
	}

	public static void spiraldisplay(int[][] arr) {
		
	}

	
}
