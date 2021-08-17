package HashMapp;

public class HashMap_Implementation {

	private class Node{
		String key;
		Integer value;
		Node next;	
		public Node(String key, Integer value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	Node[] bucket_Arr;
	int size;
	
	public HashMap_Implementation() {
		this(4);
	}
	
	public HashMap_Implementation(int capacity) {
		bucket_Arr = new Node[capacity];
		size = 0;
		
	}
	
	private int hashfunction(String key) {
		int hc = key.hashCode();
		int bn = hc%bucket_Arr.length;
		return bn;
	}
	
	public void put(String key, Integer value) {
		
		int bn = hashfunction(key);
		Node temp = bucket_Arr[bn];
		
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp=temp.next;
		}
		
		Node nn = new Node(key, value);
		Node head = bucket_Arr[bn];
		nn.next = head;
		bucket_Arr[bn] = nn;
		
		size++;
		
	}
	
	public Integer get(String key) {
		int bn = hashfunction(key);
		
		Node temp = bucket_Arr[bn];
		
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		
		return null;
	}
	
	public Boolean contains_key(String key) {
		int bn = hashfunction(key);
		
		Node temp = bucket_Arr[bn];
		
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		
		return false;
	}

	public Integer remove(String key) {
		
		int bn = hashfunction(key);
		Node temp = bucket_Arr[bn];
		Node prev = null;
		
		while(temp!=null) {
			
			if(temp.key.equals(key)) {
				break;
			}
			
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {
			return null;
		}
		
		if(prev==null) {
			bucket_Arr[bn] = temp.next;
		}else {
			prev.next = temp.next;
		}
		
		size--;
		
		return temp.value;		
		
	}

	
	
	
	
	
	
	
	
	
	
}
