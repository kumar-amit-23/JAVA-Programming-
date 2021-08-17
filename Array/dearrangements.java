package Array;

public class dearrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deTD(4));
	}
	
	public static int deR( int n) {
		if(n==1|| n==2)
			return n-1;
		
		int ans = (n-1) *(deR( n - 2) + deR( n - 1));
		
		return ans;
	}
	
	public static int deTD(int n) {
		int[] strg = new int[n + 1];
		
		strg[1] = 0;
		strg[2] = 1;
		
		for(int i = 3; i<=n; i++) {
			strg[i] = (i-1) *(strg[i-2] + strg[i-1]);
		}
		
		return strg[n];
		
		
		
	}

}
