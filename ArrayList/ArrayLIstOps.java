package ArrayList;

import java.util.ArrayList;

public class ArrayLIstOps {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		//Add - O(1)
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		
		list.add(1, 60);  //O(n) --> worst case when inserted at 0 index
		
		System.out.println(list);
		
		//size of list
		System.out.println(list.size());
		
		
		//get ---> constant O(1) 
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		System.out.println(list.get(list.size() - 1));
		
		//set --> replace the value at that index
		
		list.set(1, 100);  // O(n) constant tc
		
		System.out.println(list);
		
		//remove --> best case O(1) and worst case O(n)
		
		list.remove(list.size() - 1);
		System.out.println(list);
		
		//print ArrayList
		
		for(int i = 0; i<=list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		
		for(int val: list) {
			System.out.print(val + " ");
		}
		
		
		
	}

}
