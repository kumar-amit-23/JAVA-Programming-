package Array_2D;

import java.util.Scanner;

public class array_wave_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i = 0; i< row; i++) {
			for(int j = 0; j<col ; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		
		
		
		
		for(int i = 0; i< row; i++) {
			for(int j = 0; j<col ; j++) {
				System.out.print(arr[i][j] + " ");;
			}
			System.out.println();
		}
	}

}
