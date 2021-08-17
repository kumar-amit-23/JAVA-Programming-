package ArrayList;

import java.util.ArrayList;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] one = {5,7,10,10,10,20,30,30,30,50,60,60,60,80,90};
		int[] two = {10,10,15,20, 30, 30, 60, 70, 80, 80, 90};
		
		
		int i =0; 
		int j = 0;
		
		while(i<one.length && j<two.length) {
			if(one[i] == two[j]) {
				list.add(one[i]);
				i++;
				j++;
			}else if(one[i]>two[j]) {
				j++;
			}else {
				i++;
			}
			
		}
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
