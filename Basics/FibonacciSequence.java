
import java.util.Scanner;

class FibonacciSequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ending range");
        int end=sc.nextInt();
        fib(end);
    }

    public static void fib(int n){
        long a=0,b=1,sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(sum+" ");
            a=b;
            b=sum;
            sum=a+b;
        }
    }
}