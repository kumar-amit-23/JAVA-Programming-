package class_practice;

import java.util.ArrayList;

public class sumoftwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,9};
		
		
		ArrayList<Integer> res = new ArrayList<>();
		
		int n = a.length - 1;
		int m = b.length - 1;
		
		int sum = 0;
		
		int carry = 0;
		
		while(m>=0) {
			sum = a[n] + b[m] + carry;
			
			int dig = sum%10;
			res.add(dig);	
			carry = sum /10;
			
			
			m--;
			n--;
			
		}
		while(n>=0) {
			sum = a[n] + carry;
			res.add(sum%10);
			carry = sum/10;
			n--;
		}
		
		System.out.println(res);
		
		
		
		
		
	}
	
	
}
