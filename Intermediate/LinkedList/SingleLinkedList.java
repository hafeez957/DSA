import exceptions.EmptyLinkedListException;

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
    public void clear(){
        head=tail=null;
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
    public int removeFirst(){
        if(isEmpty()){
            throw new EmptyLinkedListException("List is empty");
        }else if(head.next==null) {
            int data = head.data;
            clear();
            return data;
        }else{
            int data=head.data;
            Node temp=head.next;
            head.next=null;
            head=temp;
            return data;
        }
    }

}