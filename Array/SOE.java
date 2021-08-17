package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		boolean[] primes = new boolean[n + 1];
		
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for(int table = 2; table * table <=n; table ++) {
			if (primes[table] == false)
				continue;
			
			for(int multi = 2; table * multi <=n; multi++) {
				primes[table*multi] = false;
			}
		}
		
		for(int i = 0; i<primes.length; i++) {
			if(primes[i])
				System.out.println(i);
		}
	}

}
