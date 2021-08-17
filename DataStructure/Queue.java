package DataStructure;

public class Queue {
	
	int[] data;
	int front;
	int size;
	
	Queue(){
		data = new int[5];
		front = 0;
		size = 0;
	}
	
	Queue(int n){
		data = new int[n];
		front = 0;
		size = 0;
	}
	
	public  void enqueue(int n) throws Exception {
		if(isFull()) {
			throw new Exception("Overflow");
		}
		
		int vidx = (front + size)%data.length;  // % is used for circular queue.
		data[vidx] = n;
		size++;
	}
	
	public int dequeue() throws Exception {		
		if(isEmpty()) {
			throw new Exception("Underflow");
		}
		
		int temp = data[front];
		data[front] = 0;
		front = (front+1)%data.length;   // % is used for circular queue
		size--;
		return temp;
	}
	
	public int getFront() {
		return data[front];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public boolean isFull() {
		return size() == data.length;
	}
	
	public void display() {
		
		System.out.println("-----------------------------");
		
		for(int i = 0; i<size; i++) {
			System.out.print(data[(i+front)%data.length] + " ");
		}
		System.out.println("-----------------------------");
		
	}

}
