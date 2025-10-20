
// Happy Number : A number in which sum of square of a digit is recursively calculated as one
// example : 19

import java.util.Scanner;

class Happy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isHappy(num))
            System.out.println("The "+num+" is Happy Number");
        else
            System.out.println("The "+num+" is not a Happy Number");
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=(ld*ld);
            n/=10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        if(n==1)
            return true;
        else if(n==4)
            return false;
        else
            return isHappy(sumOfDigits(n));
    }
}