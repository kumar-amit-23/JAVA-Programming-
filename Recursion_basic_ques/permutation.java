package Recursion_basic_ques;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutationn("abc", "");

	}

	public static void permutationn(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i = 0; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i) + ques.substring(i + 1);
			
			permutationn(roq, ans + ch);
		}
		
	}
}
