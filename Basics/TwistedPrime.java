
//Twisted Prime :- A number which is prime and the reverse of that number is also prime.

import java.util.Scanner;

class TwistedPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(countOfFactors(num)==2){
            if(countOfFactors(reverse(num))==2){
                System.out.println("The "+num+" is a Twisted prime number");
            }else{
                System.out.println("The "+num+" is not a Twisted prime number");
            }
        }else{
            System.out.println("The "+num+" is not a prime number");
        }
    }

    public static int countOfFactors(int n){
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0)
                count++;
        }
        return count;
    }

    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=rev*10+lastDigit;
            n/=10;
        }
        return rev;
    }
}