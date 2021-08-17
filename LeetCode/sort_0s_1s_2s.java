package LeetCode;

public class sort_0s_1s_2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,0,1,1,2,2,0,0};
		
		int low = 0, mid = 0, high = arr.length-1;
		
		while(mid<=high) {
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else if(arr[mid] == 2) {
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
