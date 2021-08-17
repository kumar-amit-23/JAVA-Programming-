package Array;

import java.util.Scanner;

public class zero_at_the_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int count = 0;

        for(int i = 0; i<n;i++) {
			if(arr[i] == 1){
                count++;
            }
		}
        for(int i = 0; i<count;i++){
            arr[i] = 1;
        }
        for(int i = count;i<arr.length;i++){
            arr[i] = 0;
        }

        for(int i = 0; i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
