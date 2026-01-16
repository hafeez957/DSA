package singlelinkedlist;

import exceptions.EmptyLinkedListException;

public class SingleLinkedList {

	Node head=null;
	Node tail=null;

	public void add(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
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
    public void removeEle(int data) {
        if(isEmpty()) {
            throw new EmptyLinkedListException("Empty");
        }
        else {
            Node temp=head;
            while(temp.next!=null) {
                if(head.data==data) {
                    removeFirst();
                }
                if(tail.data==data) {
                    removeLast();
                }
                if(temp.next.data==data) {
                    Node removenode=temp.next;
                    Node next=removenode.next;
                    removenode.next=null;
                    temp.next=next;
                }
                temp=temp.next;
            }

        }
    }

    public int size(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public int middle(){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(size()%2==0){
            return slow.next.data;
        }else{
            return slow.data;
        }
    }
}