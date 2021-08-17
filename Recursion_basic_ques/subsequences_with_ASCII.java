package Recursion_basic_ques;

public class subsequences_with_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequenceASCII("ab","");

	}
	public static void subsequenceASCII(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		String roq = ques.substring(1);
		char ch = ques.charAt(0);
		subsequenceASCII(roq, ans);
		subsequenceASCII(roq, ans + ch);
		subsequenceASCII(roq, ans + (int)ch);
	}

}
