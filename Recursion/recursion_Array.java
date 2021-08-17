package Recursion;

public class recursion_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 80, 30, 30, 50 };
		// Reverse_Display(arr, 0);
		// System.out.println(max_value(arr, 0));
		//System.out.println(last_occurence(arr, 30, 0));
		
		int[] res = all_indexes(arr, 30, 0, 0);
		
		for(int val : res) {
			System.out.println(val);
		}

	}

	public static void Display(int[] arr, int vidx) {

		if (vidx >= arr.length)
			return;

		System.out.print(arr[vidx] + ", ");
		Display(arr, vidx + 1);
	}

	public static void Reverse_Display(int[] arr, int vidx) {

		if (vidx >= arr.length)
			return;

		Reverse_Display(arr, vidx + 1);

		System.out.print(arr[vidx] + " ");
	}

	public static int max_value(int[] arr, int vidx) {

		if (vidx >= arr.length)
			return -1;
		int sp = max_value(arr, vidx + 1);

		if (arr[vidx] > sp)
			return arr[vidx];
		return sp;

	}

	public static int first_occurence(int[] arr, int item, int vidx) {
		if (vidx >= arr.length)
			return -1;

		if (arr[vidx] == item)
			return vidx;

		int ans = first_occurence(arr, item, vidx + 1);

		return ans;
	}

	public static int last_occurence(int[] arr, int item, int vidx) {
		if (vidx >= arr.length)
			return -1;

		int ans = last_occurence(arr, item, vidx + 1);

		if (arr[vidx] == item && vidx > ans)
			return vidx;

		return ans;
	}

	public static int[] all_indexes(int[] arr, int item, int vidx, int count) {
		
		if(vidx == arr.length) {
			int[] br = new int[count];
			return br;
		}
		
		if(arr[vidx] == item) {
			int[] rr = all_indexes(arr, item, vidx + 1, count + 1);
			rr[count] = vidx;
			return rr;
		}else {
			int[] rr = all_indexes(arr, item, vidx + 1, count);
			return rr;
		}
	}
}
