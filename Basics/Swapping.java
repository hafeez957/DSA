
import java.util.Scanner;

// Swapping two numbers

class Swapping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println("After swapping");
        swap(a,b);

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }

/*
        // alternate ways
     public static void swap(int a,int b){

        //using arithmetic operations

        a=a+b;
        b=a-b;
        a=a-b;
        

        a=a*b;
        b=a/b;
        a=a/b;


    }
    */
}