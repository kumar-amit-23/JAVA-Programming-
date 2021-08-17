package Array_2D;

import java.util.Iterator;
import java.util.Scanner;



public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeinput();
		display(arr);

}
	public static int[][] takeinput(){
		Scanner scn = new Scanner(System.in);
		System.out.println("rows?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		
		for(int i = 0; i<rows; i++) {
			System.out.println("no of col for " + i + " row");
			int cols = scn.nextInt();
			
			arr[i] = new int[cols];
			for(int c = 0; c<cols; c++) {
				System.out.println("[arr" + i + "-" + c + "]");
				arr[i][c] = scn.nextInt();
			}
		}
		
		return arr;
	}
	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");				
			}
			System.out.println();
			
		}
	}
	
}
