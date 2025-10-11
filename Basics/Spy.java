
//Spy Number :- Sum of digits in a given number is equal to product of digits in the same number.
//Examples :- 1,... 9, 22,132 etc. 

import java.util.Scanner;

class Spy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isSpy(num))
            System.out.println("The "+num+" is Spy number");
        else
            System.out.println("The "+num+" is Not a Spy number");
    }

    public static boolean isSpy(int n){
        int sum=0;
        int product=1;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            product*=lastDigit;
            n/=10;
        }
        return sum==product;
    }
}