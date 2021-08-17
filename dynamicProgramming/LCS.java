package dynamicProgramming;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(LCSRecursion("abde", "abecdf"));
//		System.out.println(LCSRecursionVidx("abde", "abecdf", 0, 0));
		String str1 = "asasdnxncjsnckasaskdmlkadas";
		String str2 = "bhdsjbchjdscbjhasasdnx";
		int[][] strg = new int[str1.length()][str2.length()];
		System.out.println(LCSTD(str1, str2, 0, 0, strg));
		
		System.out.println(LCS_BU(str1, str2));
		

	}
	
	public static int LCSRecursion(String str1, String str2) {
		
		if(str1.length() == 0 || str2.length() == 0)
			return 0;
		
		char fc1 = str1.charAt(0);
		char fc2 = str2.charAt(0);
		
		String roq1 = str1.substring(1);
		String roq2 = str2.substring(1);
		
		int count = 0;
		if(fc1 == fc2) {
			count = LCSRecursion(roq1, roq2) + 1;
		}else {
			
			int o1 = LCSRecursion(str1, roq2);
			int o2 = LCSRecursion(roq1, str2);
			
			count = Math.max(o1, o2);
		}
		
		return count;
	}
	
	public static int LCSRecursionVidx(String str1, String str2 , int vidx1, int vidx2) {
		
		if(str1.length() == vidx1 || str2.length() == vidx2)
			return 0;
		
		char fc1 = str1.charAt(vidx1);
		char fc2 = str2.charAt(vidx2);
		
		
		int count = 0;
		if(fc1 == fc2) {
			count = LCSRecursionVidx(str1, str2, vidx1 + 1, vidx2 + 1 ) + 1;
		}else {
			
			int o1 = LCSRecursionVidx(str1, str2, vidx1, vidx2 + 1);
			int o2 = LCSRecursionVidx(str1, str2, vidx1 + 1, vidx2);
			
			count = Math.max(o1, o2);
		}
		
		return count;
	}

	public static int LCSTD(String str1, String str2 , int vidx1, int vidx2 , int[][] strg) {
		
		if(str1.length() == vidx1 || str2.length() == vidx2)
			return 0;
		
		if(strg[vidx1][vidx2] != 0)
			return strg[vidx1][vidx2];
		
		char fc1 = str1.charAt(vidx1);
		char fc2 = str2.charAt(vidx2);
		
		
		int count = 0;
		if(fc1 == fc2) {
			count = LCSTD(str1, str2, vidx1 + 1, vidx2 + 1 , strg) + 1;
		}else {
			
			int o1 = LCSTD(str1, str2, vidx1, vidx2 + 1, strg);
			int o2 = LCSTD(str1, str2, vidx1 + 1, vidx2, strg);
			
			count = Math.max(o1, o2);
		}
		strg[vidx1][vidx2] = count;
		return count;
	}

	public static int LCS_BU(String s1, String s2) {
		int[][] strg1 = new int[s1.length() + 1][s2.length() + 1];
		
		for(int row = s1.length() - 1; row>=0; row-- ) {
			for(int col = s2.length() - 1; col>=0; col--) {
				if(s1.charAt(row) == s2.charAt(col)) {
					strg1[row][col] = strg1[row + 1][col + 1] + 1;
				}else {
					int o1 = strg1[row + 1][col];
					int o2 = strg1[row][col + 1];
					
					strg1[row][col] = Math.max(o1, o2);
				}
			}
		}
		
		return strg1[0][0];
	}
}
