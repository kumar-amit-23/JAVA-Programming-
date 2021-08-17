package Recursion_basic_ques;

public class lexicalCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lexicalOrderCounting(1000, 0);
		jumpingNumbers(20, 0);

	}
	
	public static void lexicalOrderCounting(int n, int current) {
		
		if(current>n)
			return;
		
		
		
		System.out.println(current);
		int i = 0;
		
		if(current == 0)
			i = 1;
		
		while(i<9) {
			lexicalOrderCounting(n, current*10 + i);
			i++;
		}
	}
	
	
	public static void jumpingNumbers(int n, int curr) {
		
		if(curr > n)
			return;
		System.out.println(curr);
		if(curr==0) {
			for(int i = 1; i<=9; i++) {
				jumpingNumbers(n, i);
			}
		}else {
		
		int rem = curr % 10;
		
		if(rem!=0) 
			jumpingNumbers(n, curr * 10 + (rem - 1));
			
		if(rem!=9)
			jumpingNumbers(n, curr * 10 + (rem + 1));
			
		}
		
		
		
		
	}

}
