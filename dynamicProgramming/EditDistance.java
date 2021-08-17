package dynamicProgramming;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Saturday";
		String str2 = "Sunday";
		
		System.out.println(EDRecusrsion(str1, str2));

	}
	
	public static int EDRecusrsion(String str1 , String str2) {
		
		
		if(str1.length()==0 || str2.length()==0) {
			return Math.max(str1.length(), str2.length());
		}
		
		char ch1 = str1.charAt(0);
		char ch2 = str2.charAt(0);
		
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		
		
		int ans = 0;
		if(ch1 == ch2) {
			ans = EDRecusrsion(ros1, ros2);
		}else {
			int i = EDRecusrsion(ros1, str2);
			int d = EDRecusrsion(str1, ros2);
			int r = EDRecusrsion(ros1, ros2);
			
			ans = Math.min(i, Math.min(d, r)) + 1;
		}
		
		return ans;
	}
	
	public static int EDRecusrsionVidx(String str1 , String str2, int vidx1, int vidx2) {
		
		
		if(str1.length() - vidx1==0 || str2.length() - vidx2 == 0) {
			return Math.max(str1.length() - vidx1, str2.length() - vidx2);
		}
		
		char ch1 = str1.charAt(vidx1);
		char ch2 = str2.charAt(vidx2);
		
		
		
		
		int ans = 0;
		if(ch1 == ch2) {
			ans = EDRecusrsionVidx(str1, str2, vidx1 + 1, vidx2 + 1);
		}else {
			int i = EDRecusrsionVidx(str1, str2, vidx1 + 1, vidx2);
			int d = EDRecusrsionVidx(str1, str2, vidx1, vidx2 + 1);
			int r = EDRecusrsionVidx(str1, str2, vidx1 + 1, vidx2 + 1 );
			
			ans = Math.min(i, Math.min(d, r)) + 1;
		}
		
		return ans;
	}

}
