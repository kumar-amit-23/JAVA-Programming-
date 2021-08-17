package HashMapp;

import java.util.HashMap;

import ArrayList.intersection;

public class HashMap_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<String,Integer> map = new HashMap<>();
		//map.put("India", 10);
		//map.put("Aus", 20);
		//map.put("UK", 30);
		//System.out.println(map.size());
		//System.out.println(map);
		//map.remove("Aus");
		//System.out.println(map);
		
	//	for(String key : map.keySet()) {
	//		System.out.println(key + "-->" + map.get(key));
	//	}
		
		//System.out.println(max_freq_char("aaabbbbccccaaabbccc"));
//		int[] one = {10,10,10,20,20,20,30,30,30};
	//	int[] two = {10,20,30,10,20,30};
		
		//Intersection(one,two );
		
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6};
		longestConsecutive_Seq(arr);
	}
	
	public static char max_freq_char(String ques) {
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			
			if(map.containsKey(ch)) {
				int of = map.get(ch);
				int nf = of+1;
				map.put(ch, nf);
			}else {
				map.put(ch, 1);
			}
		}
		
		int max = 0;
		char maxfreqchar = ' ';
		for(char key : map.keySet()) {
			int val = map.get(key);
			
			if(val>max) {
				max = val;
				maxfreqchar = key;
			}	
		}
		
		return maxfreqchar;
	}
	
	public static void Intersection(int[] one, int[] two) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int key : one) {
			int nf = map.getOrDefault(key, 0) + 1;
			map.put(key, nf);
		}
		
		for(int key : two) {
			
			if(map.containsKey(key) && map.get(key) >0) {
				System.out.println(key);
				map.put(key, map.get(key) - 1);
				
			}
		}
		
		
		
		
		
		
	}
	
	public static void longestConsecutive_Seq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int key : arr) {
			if(map.containsKey(key - 1)) {
				map.put(key, false);
			}else {
				map.put(key, true);
			}
			
			if(map.containsKey(key+1)) {
				map.put(key + 1, false);
			}			
			
		}
		
		int max = 0;
		int starting_point = 0;
		for(int key : map.keySet()) {
			if(map.get(key)) {
				int count = 0;
				while(map.containsKey(key+count))
					count++;
				//System.out.println(key + "-->" + count);
				if(count>max) {
					max = count;
					starting_point = key;
				}
			
			}
		}
		
		for(int i = 0; i<max; i++) {
			System.out.println(starting_point + i);
		}
	}
	
	
	
	
	
	
	
}
