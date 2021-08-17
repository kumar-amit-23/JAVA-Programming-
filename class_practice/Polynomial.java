package class_practice;

import java.util.Scanner;
import java.util.*;

public class Polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int x = scn.nextInt();
		
		int sum = 0;
		
		int multi = (int)(Math.pow(x, n));
		
		
		for(int i = 1; i<=n; i++) {
			
				sum += i * multi;
				multi/=x;
				
		}
		System.out.println(sum);
	}

}
