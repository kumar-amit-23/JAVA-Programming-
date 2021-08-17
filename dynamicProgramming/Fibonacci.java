package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(fibonaciTD(n, new int[n+1]));
		System.out.println(fiboBU(25));
		System.out.println(fiboBU_SE(25));

	}
	public static int fibonaciTD(int n, int[] stg) {
		if(n==0 || n==1)
			return n;
		
		if(stg[n]!=0)
			return stg[n];
		
		int fn = fibonaciTD(n-1, stg) + fibonaciTD(n-2, stg);
		
		stg[n] = fn;
		
		return fn;
	}

	public static int fiboBU(int n) {
		int[] str = new int[n+1];
		
		str[0] = 0;
		str[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			str[i] = str[i-1] + str[i-2];
		}
		
		return str[n];
	}

	public static int fiboBU_SE(int n) {
		int[] strg = new int[2];
		
		strg[0] = 0;
		strg[1] = 1;
		
		for(int i = 2; i<=n; i++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		
		return strg[1];
	}
}
