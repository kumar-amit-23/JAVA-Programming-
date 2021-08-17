package LeetCode;

public class KConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2};
		System.out.println(kConcatenationMaxSum(arr, 3));

	}
	public static int kConcatenationMaxSum(int[] arr, int k) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum +=arr[i];
		}
		
		if(k==1) {
			return kaddane(arr);
		}else if(sum<0) {
			return kaddane2Times(arr);
		}else {
			return kaddane2Times(arr) + (k-2)*sum;
		}
	}
	private static int kaddane2Times(int[] arr) {
		// TODO Auto-generated method stub
		int[] na = new int[arr.length*2];
		for(int i = 0; i<arr.length; i++) {
			na[i] = arr[i];
			na[arr.length + i] = arr[i];
		}
		return kaddane(na);
	}
	private static int kaddane(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum = arr[0];
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			
			sum = Math.max(arr[i], sum + arr[i]);
			if(sum>max)
				max = sum;
		}
		
		if(max<0)
			return 0;
		
		
		return max;
	}
}
