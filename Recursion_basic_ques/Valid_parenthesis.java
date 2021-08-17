package Recursion_basic_ques;

public class Valid_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stubv
		ValidparenthesisPrint(3, 0, 0, "");

	}
	
	public static void ValidparenthesisPrint(int n, int open, int close, String ans){
		
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		
		if(open>n || close>open) {
			return;
		}
		
		ValidparenthesisPrint(n, open + 1, close, ans + "(");
		ValidparenthesisPrint(n, open, close + 1, ans + ")");
	}

}
