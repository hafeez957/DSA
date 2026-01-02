package doubleylinkedlist;

import exceptions.EmptyLinkedListException;

public class DoubleyLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void add(int data){
        Node node=new Node(data);
        if(isEmpty()){
            head=tail=node;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        String res="[";
        Node temp=head;
        while(temp.next!=null){
            res=res+temp.data+",";
            temp=temp.next;
        }
        return res+temp.data+"]";
    }

    public void addFirst(int data){
        if(isEmpty()){
            add(data);
        }else{
            Node node=new Node(data);
            head.prev=node;
            node.next=head;
            head=node;
        }
    }

    public void addLast(int data){
        add(data);
    }

    public void clear(){
        head=tail=null;
    }
    public int removeFirst(){
        if(isEmpty()){
            throw new EmptyLinkedListException("list is empty");
        }else if(head.next==null){
            int temp=head.data;
            clear();
            return temp;
        }else {
            int temp=head.data;
            head = head.next;
            head.prev = null;
            return temp;
        }
    }
}
