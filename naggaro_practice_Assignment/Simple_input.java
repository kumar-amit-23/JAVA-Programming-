package naggaro_practice_Assignment;

import java.util.Scanner;

public class Simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		while(sum>=0) {
			int num = input.nextInt();
			sum += num;
			if (sum>=0) {
				System.out.println(num);
			}
			else {
				System.exit(0);
			}
		}

	}

}
