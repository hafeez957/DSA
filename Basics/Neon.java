
// Neon Number: A number after squaring sum of its digits is same.
// example : 9 -> 9*9 -> 81 -> 8+1 -> 9

import java.util.Scanner;

class Neon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int square=num*num;
        if(num==sumOfDigits(square))
            System.out.println("The "+num+" is Neon Number");
        else 
            System.out.println("The "+num+" is not a Neon Number");
    }

     public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }else{
            return (n%10)+sumOfDigits(n/10);
        }
    }
}