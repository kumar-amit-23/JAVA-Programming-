package LinkedList;

public class linkedList {
	
	private class Node{
		int data;
		Node next;
	}
	
	
	private Node head;
	
	public void display() {
		
		System.out.println("--------");
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("--------");
	}
	
	public int size() {
		
		int count = 0;
		
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}		
		return count;
	}
	
	public int getFirst() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		
		return head.data;
	}
	
	public int getLast() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;			
		}
		
		return temp.data;
	}
	
	public int getAt(int idx) throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		if(idx<0 || idx>=size()) {
			throw new Exception("Invalid index");
		}
		
		if(idx == 0)
			return getFirst();
		if(idx == size()-1)
			return getLast();
		
		//int count = 0;
		Node temp = head;
		for(int i = 1; i<=idx; i++)
			temp = temp.next;
		
		return temp.data;
	}
	
	private Node getNodeAt(int idx) throws Exception{
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		if(idx<0 || idx>=size()) {
			throw new Exception("Invalid index");
		}	
		Node temp = head;
		for(int i = 1; i<=idx; i++)
			temp = temp.next;
		
		return temp;
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return head==null;
	}

	public void addLast(int item) throws Exception{
		
		Node nn = new Node();
		
		nn.data = item;
		nn.next = null;
		if(isEmpty()) {
			head = nn;
		}else {		
			Node last = getNodeAt(size() - 1);
			last.next = nn;
		}
	}
	
	public void addFirst(int item) throws Exception{
		
		Node nn = new Node();
		
		nn.data = item;
		nn.next = null;
		
		nn.next = head;
		head = nn;
	}
	
	
	public void addAt(int item, int idx) throws Exception {
		if(idx<0 || idx>size()) {
			throw new Exception("Invalid index.");
		}
		
		if(idx==0)
			addFirst(item);
		else if(idx==size())
			addLast(item);
		else {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;
			
			Node n1 = getNodeAt(idx - 1);
			Node n2 = getNodeAt(idx);
			n1.next = nn;
			nn.next = n2;
		}
	}
	
	public int removeLast() throws Exception {
		
		
		int rv = getLast();
		if(size() ==1) {
			head = null;
		}else {
			Node sm2 = getNodeAt(size() - 2);
			sm2.next = null;
		}
		return rv;
	}
	
	public int removeFirst() throws Exception {
		int rv =getFirst();
		if(size() ==1) {
			head = null;
		}else {
			head = head.next;
		}
		return rv;
	}
	
	public int removeAt(int idx) throws Exception {
		
		if(isEmpty())
			throw new Exception("ll is empty");
		if(idx<0 || idx>=size())
			throw new Exception("Invalid Index");
		
		if(idx == 0)
			return removeFirst();
		else if(idx == size() - 1)
			return removeLast();
		else {
			Node im1 = getNodeAt(idx-1);
			Node i = im1.next;
			Node ip1 = i.next;
			im1.next = ip1;
			
			return i.data;
		}
	}
	
	public void reverseLinkedList() {
		Node prev = head;
		Node curr = prev.next;
		
		while(curr != null) {
			
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;			
		}
		
		head.next = curr;
		head = prev;
	}
	
	public void reverseR() {
		reverseR(null,head);
	}
	private void reverseR(Node prev, Node curr) {
		
		if(curr==null) {
			head = prev;
			return;
		}
		
		reverseR(curr, curr.next);
		curr.next = prev;		
	}
	
	public int getMid() {
		
		Node slow = head;
		Node fast = head;
		
		
		while(fast!=null && fast.next!=null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
		
	}
	
	public int kth_fromLast(int step) {
		
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i<step; i++) {
			fast = fast.next;
		}
		
		while(fast!=null) {
			slow=slow.next;
			fast = fast.next;
		}
		
		return slow.data;
		
		
		
	}
	
	
	
}
