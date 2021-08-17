package DivideConquer_SortingAlgos;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,40,25,50,67,35,11,01,56,72};
		int[] ans = mergeSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i<ans.length; i++) {
			System.out.print(ans[i] + ", ");
		}
	}
	public static int[] mergeTwoSortedArray(int[] arr, int[] arr1) {
		int[] res = new int[arr.length + arr1.length];
		
		int i = 0, j= 0, k = 0;
		
		while(i<arr.length && j<arr1.length) {
			
			if(arr[i] < arr1[j]) {
				res[k] = arr[i];
				k++;
				i++;
			}else {
				res[k] = arr1[j];
				j++;
				k++;
			}
		}
		
		while(i<arr.length) {
			res[k] = arr[i];
			k++;
			i++;
		}
		
		while(j<arr1.length) {
			res[k] = arr1[j];
			k++;
			j++;
		}
		
		
		return res;
		
		
		
	}
	
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low==high) {
			int[] bv = new int[1];
			bv[0] = arr[low];
			return bv;
		}
		
		int mid = (low + high)/2;
		
		int[] fa = mergeSort(arr, low, mid);
		int[] sa = mergeSort(arr, mid + 1, high);
		
		int[] res = mergeTwoSortedArray(fa, sa);
		
		return res;
	}
}
