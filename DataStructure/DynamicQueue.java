package DataStructure;

class DynamicQueue extends Queue  {
	
	@Override
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			int[] na = new int[data.length * 2];
			
			for(int i = 0; i<size; i++) {
				na[i] = data[(i+front)%data.length];
			}
			
			data = na;
			front = 0;
		}
		
		super.enqueue(item);
	}

}
