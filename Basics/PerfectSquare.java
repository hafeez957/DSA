
// Perfect Square number : numbers that are the products of integers by themselves.
// example : 4 is a perfect square because you get it by multiplying 2*2

import java.util.Scanner;

class PerfectSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(perfectSquare(num))
            System.out.println("The "+num+" is a Perfect Square number");
        else
            System.out.println("The "+num+" is not a Perfect Square number");
    }

    public static boolean perfectSquare(int n){
        for(int i=1;i<=n/2;i++){
            if(i*i==n)
                return true;
        }
        return false;
    }
}