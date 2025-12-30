public class SingleLinkedList {
	
	Node head;
	Node tail;
	
	public void add(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		String res="[";
		Node temp=head;
		while(temp.next!=null) {
			res=res+temp.data+" , ";
			temp=temp.next;
		}
		return res+temp.data+"]";
	}
}