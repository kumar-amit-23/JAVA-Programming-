package dynamicProgramming;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,3,5,1,4};
		int[] arr = new int[1000];
		
		for(int i=0; i<1000; i++) {
			arr[i] = i;
		}
		
		//System.out.println(wineRecursionIndx(arr, 1, 0, arr.length-1));
		
		System.out.println(wineTD(arr, 0, arr.length-1, new int[arr.length][arr.length]));

	}
	
	public static int  wineRecursionIndx(int[] arr, int yr, int si, int ei) {
		
		if(si == ei)
			return arr[si]*yr;
		
		int start = wineRecursionIndx(arr, yr + 1, si + 1,ei) + arr[si] *yr;
		int end = wineRecursionIndx(arr, yr + 1, si, ei - 1) + arr[ei]*yr;
		
		int ans = Math.max(start, end);
		
		return ans;
	}
	
	public static int  wineTD(int[] arr,  int si, int ei, int[][] strg) {
		
		int yr = arr.length - (ei-si + 1) + 1;	
		if(si == ei)
			return arr[si]*yr;
	
		if(strg[si][ei] != 0)
			return strg[si][ei];
		
		
		int start = wineTD(arr,  si + 1,ei, strg) + arr[si] *yr;
		int end = wineTD(arr, si, ei - 1, strg) + arr[ei]*yr;
		
		int ans = Math.max(start, end);
		
		strg[si][ei] = ans;
		
		return ans;
	}

}
