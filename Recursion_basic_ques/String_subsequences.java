package Recursion_basic_ques;

public class String_subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequences("abc", "");
	}
	public static void subsequences(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		subsequences(roq, ans);
		subsequences(roq, ans + ch);
	}

}
