package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Printallsubarrayswith0sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		printAllSubArrays(arr);
	}
	
	public static boolean subarray0sum(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		set.add(0);
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			
			if(set.contains(sum))
				return true;
			
			set.add(sum);
		}
		
		return false;
		
	}

	public static void printAllSubArrays(int[] arr) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		map.put(0, new ArrayList<>());
		map.get(0).add(-1);
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
			
			if(!map.containsKey(sum))
				map.put(sum, new ArrayList<>());
			
			ArrayList<Integer> temp = map.get(sum);
			
			for(int val : temp) {
				System.out.println(val + 1 + "-->" + i);
			}
			
			map.get(sum).add(i);
		}
	}
}
