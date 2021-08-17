package LeetCode;

public class FirstPositiveNumber_Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0};
		
		System.out.println(firstMissingPositive(arr));

	}
	 public static int firstMissingPositive(int[] arr) {
	        int n = arr.length;
			
	        for(int i = 0; i<n; i++) {
				if(arr[i]<=0 || arr[i] > arr.length) {
					arr[i] = n + 1;
				}
			}
			
			
			for(int i = 0; i<n; i++) {
				int val = Math.abs(arr[i]) - 1;
				
				if(val!=n  && val>=0) {
					arr[val ] = - arr[val];
				}
			}
	        
	        for(int i = 0; i<n; i++){
	            if(arr[i] > 0)
	                return i+1;
	        }
	        
	        return n+1;
	        
	    }

}
