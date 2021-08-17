package ArrayList;

import java.util.ArrayList;
import java.util.Collection;


public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = {1,2,3,4,5};
		int[] two = {12,22,34};
		
		ArrayList<Integer> res = new ArrayList<>();
		
		int i = one.length - 1;
		int j = two.length - 1;
		
		
		int sum = 0;
		int carry = 0;
		
		while(i>=0 || j>=0) {
			sum = carry;
			
			if(i>=0) {
				sum += one[i];
			}
			
			if(j>=0) {
				sum += two[j];
			}
			int rem = sum%10;
			res.add(rem);
			
			carry = sum/10;
			
			i--;
			j--;
			
		}
		
		System.out.println(res);
	}

}
