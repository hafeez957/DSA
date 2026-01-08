package doubleylinkedlist;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        DoubleyLinkedList dll=new DoubleyLinkedList();
        LinkedList l=new LinkedList();


        dll.add(10);
        dll.add(12);
        dll.add(10.45);
        dll.add("23");
        dll.insert(1,13);
        System.out.println(dll.remove(2));
        System.out.println(dll.removeFirst());
        System.out.println(dll.removeLast());
        System.out.println(dll);
        System.out.println(dll.isPalindromic());
    }
}
