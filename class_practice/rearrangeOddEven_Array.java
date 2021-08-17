package class_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrangeOddEven_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2,5,4,7,10};
		rearrange(arr);
	}
	public static void rearrange(int[] arr) {
		Arrays.sort(arr);
		
		ArrayList<Integer> Even = new ArrayList<>();
		ArrayList<Integer> Odd = new ArrayList<>();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				Even.add(arr[i]);
			}else {
				Odd.add(arr[i]);
			}
		}
		
		int index = 0, i=0, j=0;
		boolean flag = false;
		if(arr[i] %2 == 0)
			flag = true;
		
		while(index<arr.length) {
			if(flag == true) {
				arr[index] = (int)Even.get(i);
				i++;
				index++;
				flag = !flag;
			}else {
				arr[index] = (int)Odd.get(j);
				j++;
				index++;
				flag = !flag;
			}
		}
		
		for(int var= 0; var<arr.length; var++) {
			System.out.print(arr[var] + ", ");
		}
	
	
	
	
	}

}
