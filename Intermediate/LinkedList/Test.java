class Test{
    public static void main(String[] args) {
        SingleLinkedList list =new SingleLinkedList();
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(30);
        list.removeEle(20);
        System.out.println(list);
    }
}