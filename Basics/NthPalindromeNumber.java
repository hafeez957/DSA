//Finding Nth palindrome number like from 1 to 5 palindrome numbers are 1,2,3,4,5 respectively.

import java.util.Scanner;

class NthPalindromeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int slno=0;
        int n=1;
        while(n>0){
            if(palindrome(n)){
                slno++;
            
                if(slno==num){
                    System.out.println("The "+num+"th palindrome number is "+n);
                    break;
                }
            }  
            n++;
        }
        
    }

    public static boolean palindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            int lastDigit=temp%10;
            rev=rev*10+lastDigit;
            temp/=10;
        }
        return n==rev;
    }
}