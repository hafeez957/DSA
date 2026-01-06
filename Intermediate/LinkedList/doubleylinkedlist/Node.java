package doubleylinkedlist;

public class Node<T> {
    Node prev;
    T data;
    Node next;

    public Node(T data){
        this.data=data;
    }
}
