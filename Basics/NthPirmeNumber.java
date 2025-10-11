//Finding Nth Prime number like from 1 to 5 Prime numbers are  2,3,5 respectively.

import java.util.Scanner;

class NthPirmeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int slno=0;
        int n=1;
        while(true){
            if(isPrime(n)){
                slno++;
                if(slno==num){
                    System.out.println(n);
                    break;
                }
            }
            n++;

        }
    }

    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return count==2;
    }
}