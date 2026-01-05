package doubleylinkedlist;

import exceptions.EmptyLinkedListException;
import exceptions.InvalidIndexException;

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

    public int removeLast(){
        if(isEmpty()){
            throw new EmptyLinkedListException("List is empty");
        }else if(head.next==null){
            int temp=head.data;
            clear();
            return temp;
        }else{
            int temp=tail.data;
            tail=tail.prev;
            tail.next=null;
            return temp;
        }
    }
    public int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public boolean isPalindromic(){
        if(isEmpty()){
            throw new EmptyLinkedListException("list is empty");
        }else if(head.next==null){
            return true;
        }else {
            Node temp = head;
            int count = size();
            while (count > 0) {
                if (temp.data != tail.data) {
                    return false;
                }
                temp = temp.next;
                tail = tail.prev;
                count--;
            }
            return true;
        }
    }

    public void insert(int ind,int data){
        if(ind<0||ind>size()){
            throw new InvalidIndexException("Invalid index");
        }else if(ind==0){
            addFirst(data);
        }else if(ind==size()){
            addLast(data);
        }else{
            Node node =new Node(data);
            Node temp=head;
            while (ind>1){
                temp=temp.next;
                ind--;
            }
            Node next=temp.next;
            temp.next=node;
            node.prev=temp;
            node.next=next;
            next.prev=node;
        }
    }
}
