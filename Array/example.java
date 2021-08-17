package Array;

import java.util.Arrays;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i<n; i++){
            if(arr[i] != arr[i+1]){
                
                System.out.println(arr[i+1]);
                break;
            }
        }

	}

}
