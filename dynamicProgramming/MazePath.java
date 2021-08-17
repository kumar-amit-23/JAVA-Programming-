package dynamicProgramming;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(MazePathR(0, 0, 2, 3));
		int n = 20;
		System.out.println(MazePathTD(0, 0, n, n, new int[n+1][n+1]));
		System.out.println(MazePath_BU(n, n));
	}
	public static int MazePathR(int sr, int sc, int er, int ec) {
		
		
		if(sr == er && sc == ec) {
			return 1;
		}
		
		if(sr>er || sc > ec)
			return 0;
		
		int ch = 0;
		int cv = 0;
		
		cv += MazePathR( sr + 1, sc, er, ec);
		ch += MazePathR(sr, sc + 1, er, ec);
		
		
		
		
		return ch + cv;
	}
	
	
	public static int MazePathTD(int sr, int sc, int er, int ec, int[][] strg) {
		
		
		if(sr == er && sc == ec) {
			return 1;
		}
		
		if(sr>er || sc > ec)
			return 0;
		
		if(strg[sr][sc] != 0)
			return strg[sr][sc];
		
		int ch = 0;
		int cv = 0;
		
		cv += MazePathTD( sr + 1, sc, er, ec, strg);
		ch += MazePathTD(sr, sc + 1, er, ec, strg);
		
		strg[sr][sc] = ch + cv;
		
		
		return ch + cv;
	}
	
	
	public static int MazePath_BU(int er, int ec) {
		int[][] strg = new int[er + 2][ec + 2];
		
		
		for(int row = er ; row>=0; row--) {
			for(int col = ec; col>=0; col--) {
				if(row==er && col == ec) {
					strg[row][col] = 1;
				}else {
					strg[row][col] = strg[row+1][col] + strg[row][col+1];
				}
			}
		}
		
		return strg[0][0];
		
		
	
	
	}
}
