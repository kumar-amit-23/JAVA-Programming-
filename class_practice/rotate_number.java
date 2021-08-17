package class_practice;

import java.util.Scanner;
import java.math.*;

public class rotate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int rot = scn.nextInt();
		int count = 0;
		int temp = num;
		while(temp!=0) {
			temp /= 10;
			count++;
		}
		rot = rot%count;
		
		int div = (int)Math.pow(10, rot);
		int rem = num % div;
		int quo = num /div;
		
		
		int ans = rem * (int)Math.pow(10, count - rot) + quo;
		System.out.println(ans);
		
	}

}
