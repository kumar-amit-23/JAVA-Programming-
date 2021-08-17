package Recursion_basic_ques;

import java.util.ArrayList;



public class CoinToss_probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cointoss(3, "");
		NoConsecutiveHeads(3, "", false);

	}
	

	
	public static void cointoss(int n, String ans) {
		
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		
		cointoss(n - 1, ans + "H");
		cointoss(n - 1, ans + "T");
		
		
		
	}
	
	public static void NoConsecutiveHeads(int n , String ans, boolean flag) {
		
		//boolean flag = false;
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(flag)
			NoConsecutiveHeads(n-1, ans + "T", false);
		else {
			NoConsecutiveHeads(n-1, ans +"H", true);
			NoConsecutiveHeads(n-1, ans + "T", false);
		}
		
		
		
		
	}

}
