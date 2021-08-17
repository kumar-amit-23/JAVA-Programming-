package class_practice;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		armstrongg(num1,num2);

	}

	private static void armstrongg(int num1, int num2) {
		// TODO Auto-generated method stub
		for(int i = num1;i<=num2;i++) {
			int check,rem , sum = 0;
			check = i;
			while(check!=0) {
				rem = check%10;
				sum += rem*rem*rem;
				check /= 10;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
		//return ;
		
	}

}
