package LeetCode;

public class find_pivot_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,7,3,6,5,6};
//		System.out.println(pivotIndex(nums));
//		System.out.println(pivotIndex_method2(nums));
		
		
		

	}
	public static int pivotIndex(int[] nums) {
        int[] left  = new int[nums.length];
        left[0] = nums[0];
        
        for(int i = 1; i<nums.length; i++) {
        	left[i] = left[i-1] + nums[i];
        }
                   
        int[] right  = new int[nums.length];
        right[right.length - 1] = nums[nums.length- 1];
        
        for(int i = nums.length - 2; i>=0; i--) {
        	right[i] = right[i+1] + nums[i];
        }
        
        
        for(int i = 0; i<nums.length; i++) {
        	if(left[i] == right[i])
        		return i;
        }
        
        
        return -1;
        
        
        
        
    }
	
	
	
	public static int pivotIndex_method2(int[] nums) {
		
		int sum = 0;
		int leftsum = 0;
		
		for(int i = 0; i<nums.length; i++) {
			sum +=nums[i];
		}
		
		for(int i = 0; i<nums.length; i++) {
			sum = sum - nums[i];
			if(leftsum == sum)
				return i;
			
			leftsum += nums[i];
		}
		
		return -1;
	}

}
