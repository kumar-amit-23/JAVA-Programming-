package Recursion_basic_ques;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moves(0,0,"",2,2);
		

	}
	
	public static void moves(int start_h, int start_v, String ans, int target_v, int target_h ) {
		
		if(start_v == target_v && start_h==target_h) {
			System.out.println(ans);
			return;
		}
		
		
		if(start_h>target_h || start_v>target_v) {
			return;
		}
		
		moves(start_h + 1 , start_v, ans + "H", target_v, target_h);
		moves(start_h, start_v + 1, ans + "V", target_v, target_h);
		
	}

}
