package dynamicProgramming;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 40;
		//System.out.println(BP_recursive(0, n));
		System.out.println(BP_TD(0, n, new int[n]));
		System.out.println(BP_BU(40));

	}
	public static int BP_recursive(int curr, int end) {
		if(curr==end)
			return 1;
		
		if(curr>end)
			return 0;
		int count = 0;
		for(int dice = 1; dice<=6; dice++)
			count+= BP_recursive(curr + dice, end);
	
		return count;
	}
	
	
	public static int BP_TD(int curr, int end, int[] strg) {
		if(curr==end)
			return 1;
		
		if(curr>end)
			return 0;
		
		if(strg[curr] != 0)
			return strg[curr];
		int count = 0;
		for(int dice = 1; dice<=6; dice++)
			count+= BP_TD(curr + dice, end, strg);
		
		strg[curr] = count;
	
		return count;
	}
	
	public static int BP_BU(int end) {
		int[] strg = new int[end + 6];
		strg[end] = 1;
		
		for(int i = end - 1; i>=0; i--)
			strg[i] = strg[i+1] + strg[i+2] + strg[i+3] + strg[i+4] + strg[i+6] + strg[i+5];
		
		return strg[0];
		
	}
	
	

}
