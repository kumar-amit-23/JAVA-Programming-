package naggaro_practice_Assignment;

import java.util.Scanner;

public class quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int R1 = 0;
		int R2 = 0;
		int D = b*b - 4*a*c;
		if(D>0) {
			System.out.println("Real and Distinct");
		}else if(D==0) {
			System.out.println("Real and Equal");
		}else {}
		R1 = (-b + (int)Math.sqrt(D))/2*a;
		R2 = (-b - (int)Math.sqrt(D))/2*a;
		
		if(R1>R2) {
			System.out.println(R2 + " " + R1);
		}else if(R1 == R2) {
			System.out.println(R1 + " " + R2);
		}else if(R2>R1) {
			System.out.println(R1 + " " + R2);
		}
	}

}
