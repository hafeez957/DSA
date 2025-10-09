//Checking given number is a palindrome number or not

import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(palindrome(num))
            System.out.println("The "+num+" is palindrome number");
        else
            System.out.println("The "+num+" is not a palindrome number");
    }

    public static boolean palindrome(int n){
        int rev=0;
        int temp=n;
        while(temp>0){
            int lastDigit=temp%10;
            rev=rev*10+lastDigit;
            temp/=10;
        }
        return n==rev;
    }
}