
//Reversing a given number

import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int num=sc.nextInt();
        System.out.println("Reverse of "+num+" is "+reversing(num));
    }

    public static int reversing(int n){
        int rev=0;
        while (n>0) {
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n/=10;

        }
        return rev;
    }
}