package DivideConquer_SortingAlgos;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,50,30,20,16,89,90};
		quickSort(arr, 0, arr.length-1);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void quickSort(int[] arr, int lo, int hi) {
		
		if(lo == hi || lo>hi)
			return;
		
		//partioning
		
		//start
		int mid = (lo + hi)/2;
		
		int pivot = arr[mid];
		
		
		int left = lo; 
		int right = hi;
		
		while(left<=right) {
			
			while(arr[left] < pivot)
				left++;
			while(arr[right] > pivot)
				right--;
			
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
			
			
		}
		
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
		
		//stop
	}

}
