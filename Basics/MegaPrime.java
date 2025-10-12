
//Mega Prime :- A number is prime and also it's digits are prime.

import java.util.Scanner;

class MegaPrime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(countOfFactors(num)==2){
            if(isDigitsPrime(num)){
                System.out.println("The "+num+" is a Mega prime number");
            }else{
                System.out.println("The "+num+" is not a Mega prime number");
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

    public static boolean isDigitsPrime(int n){
        while(n>0){
            int lastDigit=n%10;
            if(countOfFactors(lastDigit)!=2)
                return false;
            n/=10;
        }
        return true;
    }

}