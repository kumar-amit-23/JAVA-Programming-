package DataStructure;

public class DQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.dequeue();
		dq.dequeue();
		dq.enqueue(60);
		dq.enqueue(70);
		dq.display();
		dq.enqueue(80);
		dq.enqueue(90);
		dq.display();
	}

}
