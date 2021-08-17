package DataStructure;



public class SClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.isFull());
		s.push(40);
		s.push(50);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.size());
		s.display();
		
	}

}
