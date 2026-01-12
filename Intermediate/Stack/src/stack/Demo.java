package stack;

public class Demo {
    public static void main(String[] args) {
        StackImpl st=new StackImpl(4);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st);
    }
}
