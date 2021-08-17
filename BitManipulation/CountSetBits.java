package BitManipulation;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		System.out.println(Integer.toBinaryString(x));
		int count = 0;
		
		while(x!=0) {
			int ans = (x & 1);
			if(ans==1)
				count++;
			
			x>>=1;
		}
		System.out.println(count);

	}

}
