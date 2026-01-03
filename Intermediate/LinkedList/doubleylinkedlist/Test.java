package doubleylinkedlist;

public class Test {
    public static void main(String[] args) {
        DoubleyLinkedList dll=new DoubleyLinkedList();
        dll.add(10);
        dll.addFirst(12);
//        System.out.println(dll.removeFirst());
        System.out.println(dll.removeLast());
        System.out.println(dll);
    }
}
