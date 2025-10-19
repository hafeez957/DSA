
// Sunny Number : In a number for which the next number is a perfect square

import java.util.Scanner;

class Sunny{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(perfectSquare(num))
            System.out.println("The "+num+" is a sunny number");
        else
            System.out.println("The "+num+" is not a sunny number");
    }

    public static boolean perfectSquare(int n){
        for(int i=1;i<=n;i++){
            if(i*i==n+1)
                return true;
        }
        return false;
    }
}