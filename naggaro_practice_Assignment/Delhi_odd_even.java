package naggaro_practice_Assignment;

import java.util.Scanner;

public class Delhi_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test_case = scn.nextInt();
		while(test_case>0) {
			int num_plate = scn.nextInt();
			//int c = 1;
			int even =0;
			int odd = 0;
			int digi;
			//int n = reverse(num_plate);
			while(num_plate!=0) {
				digi = num_plate%10;
				if (digi%2==0) {
					even += digi;
				}else {
					odd += digi;
				}
				num_plate /=10;
			}
			if (even % 4 == 0 || odd % 3 == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("NO");
			}
			test_case = test_case - 1;		
		}

	}
}
