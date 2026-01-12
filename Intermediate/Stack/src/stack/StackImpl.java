package stack;

import stack.exceptions.StackOverFlowException;
import stack.exceptions.StackUnderFlowException;

public class StackImpl {
    private int top;
    private int a[];
    StackImpl(int capacity){
        a=new int[capacity];
        top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==a.length-1;
    }
    public void push(int data){
        if(isFull()){
            throw new StackOverFlowException("Can't push element");
        }
        a[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            throw new StackUnderFlowException("Can't pop element");
        }
        return a[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new StackUnderFlowException("Can't peek element");
        }
        return a[top];
    }

    public int size(){
        return top+1;
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        String s="[";
        for(int i=0;;i++){
        s=s+a[i];
            if(i==top){
                return s+"]";
            }
            s=s+", ";
        }
    }
}
