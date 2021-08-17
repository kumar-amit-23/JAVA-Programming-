package Recursion;

public class English_ruler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ruler(2,3);

	}
	
	public static void pattern(int tl) {
		
		if(tl==0)
			return;
		
		pattern(tl-1);
		
		for(int i = 0; i<tl; i++)
			System.out.print("-");
		System.out.println();
		
		pattern(tl-1);
	}
	
	public static void ruler(int inch, int mtl) {
		
		for(int i = 0; i<inch; i++) {
			pattern(mtl-1);
			for(int j = 0; j<mtl; j++) 
				System.out.print("-");
			System.out.println(" " + (i+1));	
			
		}
		
		
		
	}

}
