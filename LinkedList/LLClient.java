package LinkedList;

public class LLClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		linkedList ll = new linkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.display();
		ll.reverseLinkedList();
		ll.display();
		System.out.println(ll.getMid());
		
		

	}

}
