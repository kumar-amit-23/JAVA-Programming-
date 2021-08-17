package LeetCode;

public class Partioning3Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		partioning(arr, 14, 20);
		
	}
	
	public static void partioning(int[] arr , int lv, int hv) {
		
		
		int low = 0, mid = 0, high = arr.length-1;
		
		while(mid<=high) {
			if(arr[mid] <lv) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				low++;
				mid++;
			}else if(arr[mid] >= lv && arr[mid] <= hv) {
				mid++;
			}else if(arr[mid] >= hv ) {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				
				high--;
			}
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}

}
