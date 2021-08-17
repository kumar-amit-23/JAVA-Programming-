package Recursion;

public class Recusrion_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Increase(5);
		Decrease(5);
		//PDI(5);
		//PID(1,4);
		
		//System.out.println(factorial(5));
		//System.out.println(base_power(2, 9));
		
		System.out.println(nth_fibonacci(9));
		
		
	}
	
	public static void Increase(int n) {
		if(n==0)
			return;
		
		System.out.println(n);
		Increase(n - 1);
	}
	
	public static void Decrease(int n) {
		if(n==0)
			return;
		Decrease(n - 1);
		System.out.println(n);
	}
	
	public static void PDI(int n) {
		if(n==0)
			return;
		
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
	
	public static void PID(int start, int n) {
		if(start>n)
			return ;
		
		System.out.println(start);
		PID(start+1,n);
		System.out.println(start);
		
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		
		return factorial(n-1)*n;
	}
	
	public static int base_power(int n, int power) {
		if(power==0)
			return 1;
		
		return base_power(n, power - 1) *  n;
		
		
	}
	
	public static int nth_fibonacci(int n) {
		 if(n==0)
			 return 0;
		 if(n==1)
			 return 1;
		 
		 return nth_fibonacci(n-1) + nth_fibonacci(n-2);
	}
	
	
	
}
