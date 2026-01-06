package doubleylinkedlist;

import exceptions.EmptyLinkedListException;
import exceptions.InvalidIndexException;

public class DoubleyLinkedList<T> {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(T data) {
        Node<T> node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        String res = "[";
        Node temp = head;
        while (temp.next != null) {
            res = res + temp.data + ",";
            temp = temp.next;
        }
        return res + temp.data + "]";
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            add(data);
        } else {
            Node<T> node = new Node(data);
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    public void addLast(T data) {
        add(data);
    }

    public void clear() {
        head = tail = null;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new EmptyLinkedListException("list is empty");
        } else if (head.next == null) {
            T temp = (T) head.data;
            clear();
            return temp;
        } else {
            T temp = (T) head.data;
            head = head.next;
            head.prev = null;
            return temp;
        }
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new EmptyLinkedListException("List is empty");
        } else if (head.next == null) {
            T temp = (T) head.data;
            clear();
            return temp;
        } else {
            T temp = (T) tail.data;
            tail = tail.prev;
            tail.next = null;
            return temp;
        }
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isPalindromic() {
        if (isEmpty()) {
            throw new EmptyLinkedListException("list is empty");
        } else if (head.next == null) {
            return true;
        } else {
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

    public void insert(int ind, T data) {
        if (ind < 0 || ind > size()) {
            throw new InvalidIndexException("Invalid index");
        } else if (ind == 0) {
            addFirst(data);
        } else if (ind == size()) {
            addLast(data);
        } else {
            Node node = new Node(data);
            Node temp = head;
            while (ind > 1) {
                temp = temp.next;
                ind--;
            }
            Node next = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next = next;
            next.prev = node;
        }
    }

    public T remove(int ind){
        if (ind < 0 || ind >=size()) {
            throw new InvalidIndexException("Invalid index");
        } else if (ind == 0) {
            return removeFirst();
        } else if (ind == size()-1) {
            return removeLast();
        } else {
            Node temp = head;
            while (ind > 0) {
                temp = temp.next;
                ind--;
            }
            T data= (T) temp.data;
            Node prev = temp.prev;
            Node next = temp.next;
            prev.next = next;
            next.prev = prev;
            return data;
        }

    }
}

 