package Stack;

import java.util.Stack;

public class Sort {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack();
        s1.add(1);
        s1.add(10);
        s1.add(0);
        s1.add(3);
        s1.add(8);
        System.out.println(s1);
        System.out.println(sort(s1));
    }

    public static Stack<Integer> sort(Stack<Integer> s1){
        Stack<Integer> s2=new Stack();
        s2.push(s1.pop());
        while(!s1.empty()){
        int st1=s1.pop();
        int st2=s2.pop();
            if(st1>st2){
                s2.push(st1);
                s1.push(st2);
            }else{
                s1.push(st2);
                s2.push(st1);
            }
        }
        return s2;
    }
}

