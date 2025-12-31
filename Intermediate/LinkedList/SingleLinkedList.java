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

    public int removeLast(){
        if(isEmpty()){
            throw new EmptyLinkedListException("List is empty");
        }else if(head.next==null) {
            int data = head.data;
            clear();
            return data;
        }else{
            Node temp=head.next;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            int data=tail.data;
            temp.next=null;
            return data;
        }
    }
    public void removeEle(int ele){
        if(isEmpty()){
            throw new EmptyLinkedListException("Linked list is empty");
        }
        if(head.data==ele){
            removeFirst();
        }
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null){
            if(temp.next.data==ele){
                Node data=temp.next.next;
                temp.next.next=null;
                temp.next=data;
            }
            temp=temp.next;
        }
        if(temp.next!=null && temp.next.data==ele){
            temp.next=null;
        }
    }
}