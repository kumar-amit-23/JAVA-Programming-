package DataStructure;

class DynamicStack extends Stack {
	
	public void push(int n) throws Exception {
		
		if(isFull()) {
			int[] na = new int[data.length * 2];
			
			for(int i = tos ; i>=0; i--) {
				na[i] = data[i];
			}
			
			data = na;
			
		}
		
		//super.push(item);
	}
}
