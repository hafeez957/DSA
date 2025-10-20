
// Magic Number : A number in which sum of digits its recursively 1.
// example 1729

import java.util.Scanner;

class Magic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isMagic(num)==1)
            System.out.println("The "+num+" is Magic Number");
        else
            System.out.println("The "+num+" is not a Magic Number");
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }

    public static int isMagic(int n){
        if(n<=9)
            return n;
        else
            return isMagic(sumOfDigits(n));
    }
}