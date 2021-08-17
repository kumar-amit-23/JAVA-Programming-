package QPS;

public class Q_2 {
	// Question - 2 :- https://leetcode.com/problems/count-and-say/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));

	}
	public static String countAndSay(int n) {
        if(n==1)
        	return "1";
        
        String rr = countAndSay(n-1);
        return compress(rr);
        
                
    }
	
	public static String compress(String str) {
		String ans = "";
		
		int count = 1;
		
		for(int i = 0; i<=str.length() - 2; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				ans = ans + count + str.charAt(i)  ;
				count = 1;
			}
			
		}
		
		ans = ans + count + str.charAt(str.length()-1) ;
		return ans;
		
	}

}
