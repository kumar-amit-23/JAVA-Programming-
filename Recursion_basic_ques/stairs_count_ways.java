package Recursion_basic_ques;

public class stairs_count_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countways(0, 5, "");

	}
	
	public static void countways(int position, int target,String ans) {
	
		if(position == target) {
			System.out.println(ans);
			return;
		}
		
		if(position>target) {
			return;
		}
		
		countways( position + 1, target,ans + "1");
		countways(position + 2, target,ans + "2");
		countways(position + 5, target, ans + "5");
		countways(position + 10, target, ans + "10");

	
	}

}
