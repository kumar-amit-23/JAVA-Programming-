package LeetCode;


public class reverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = (int)Math.pow(2,31) - 1;
		//System.out.println(x);
		int x = 1534236469;
		int temp = x;
        int rem = 0;
        if(temp<-(int)Math.pow(2,31) && temp > ((int)Math.pow(2,31)-1))
            System.out.println(0);;
        if(temp<0){
            temp = -temp;
        }
        long rev = 0;
        while(temp!=0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp/=10;
            System.out.print(rem + " ");
            System.out.print(rev + " ");
        }
        
        if(x<0 && rev>=-(int)Math.pow(2,31) && rev <= ((int)Math.pow(2,31)-1))
            System.out.println(-rev);
        else if((x>0 && rev>=-(int)Math.pow(2,31) && rev <= ((int)Math.pow(2,31)-1)))
        	 System.out.println(rev);
        	 else
        		 System.out.println(0);
	}

}
