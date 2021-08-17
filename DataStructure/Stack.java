package DataStructure;

public class Stack {

	protected int[] data;
	protected int tos ;
	
	Stack() {
		data = new int[5];
		tos = -1;
	}
	
	public Stack(int capacity) {
		data = new int[capacity];
		tos = -1;
	}
	
	void push(int n) throws Exception {
		if(isFull())
			throw new Exception("Overflow");
		tos++;
		data[tos] = n;		
	}
	
	public int pop() throws Exception {
		if(isEmpty())
			throw new Exception("Underflow");
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
		
	}
	public int peek() {
		return data[tos];
	}
	
	public int size() {
		return tos+1;
	}
	
	public boolean isEmpty() {
		return tos == -1;
	}
	
	public boolean isFull() {
		return tos==data.length;
	}
	
	public void display() {
		
		System.out.println("------------");
		for(int i = tos ; i>=0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println("------------");
	}
	
	
	
}
