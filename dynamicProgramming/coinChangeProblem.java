package dynamicProgramming;

public class coinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coin = {0,2,5,6,3};
		//int n = coin.length;
		int N = 10;
		noOfWays(coin,N);

	}
	
	public static void noOfWays(int[] coin, int A) {
		int n = coin.length;
		int[][] dp = new int[n][A + 1];
		
		for(int i = 0; i<n; i++) {
			dp[i][0] = 1;
		}
		for(int j = 0;j<A+1; j++ ) {
			dp[0][j] = 0;
		}
		
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<=A; j++) {
				if(coin[i] > j) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] + dp[i][j - coin[i]];
				}
			}
		}
		
		System.out.println(dp[n-1][A]);
		
		
	}

}
