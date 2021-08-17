package String;

public class decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(countWays(str));
	}
	
	public static int countWays(String str) {
		
		int msgLen = str.length();
		
		if(msgLen==0 || msgLen==1)
			return 1;
		
		int count = 0;
		
		if(str.charAt(msgLen - 1)>'0')
			count = countWays(str.substring(0, msgLen - 1));
		
		if(str.charAt(msgLen-2)<'2' || str.charAt(msgLen-1)<'7' && str.charAt(msgLen-2) == '2')
			count+=countWays(str.substring(0,msgLen - 2));
		
		return count;
			
		
	}

}
