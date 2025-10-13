
//Strong number :- A number if sum of factorial of each digit is same number.
//like 145

import java.util.Scanner;

class Strong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
        int num=sc.nextInt();
       if(num==sumOfDigits(num))
            System.out.println("The "+num+" is Strong number");
       else
            System.out.println("The "+num+" is not a Strong number");
    }

    public static int factorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=factorial(lastDigit);
            n/=10;
        }
        return sum;
    }
}