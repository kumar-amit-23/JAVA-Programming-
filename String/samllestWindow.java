package String;

public class samllestWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "this is a test string";
		String patt = "tist";
		System.out.println(findSmallestWindow(text, patt));
	}
	
	public static String findSmallestWindow(String text, String patt) {
		
		char[] char_text = new char[256];
		char[] char_patt = new char[256];
		
		
		for(int j = 0; j<patt.length(); j++) {
			char_patt[patt.charAt(j)]++;
		}
		
		
		int count = 0;
		int start = 0;
		int start_index = -1;
		int min_length = Integer.MAX_VALUE;
		for(int i = 0; i<text.length(); i++) {
			char_text[text.charAt(i)]++;
			
			
			if(char_text[text.charAt(i)] <= char_patt[text.charAt(i)]) {
				count++;
			}
			
			
			if(count == patt.length()) {
				
				while(char_text[text.charAt(start)]>char_patt[text.charAt(start)] || char_patt[text.charAt(start)] == 0) {
					
					if(char_text[text.charAt(start)]>char_patt[text.charAt(start)])
						char_text[text.charAt(start)]--;
					
					start++;
					
				}									
			int len_window = i - start + 1;
			if(min_length>len_window) {
				min_length = len_window;
				start_index = start;
			}
			
			
			
			}
			
		}
		
		if(start_index == -1) {
			return "";
		}
		
		return text.substring(start_index, start_index + min_length);
		
		
		
		
		
	}

}
