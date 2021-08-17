package LeetCode;

public class Hamming_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		
		int xor = a^b;
	        int count = 0;
	        
	        while(xor>0){
	            
	            if((xor & 1) == 1)
	                count++;
	            
	            xor = xor>>1;
	        }
	        
	    System.out.println(count);

	}

}
