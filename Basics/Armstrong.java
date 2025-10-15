
// Armstrong :- Sum of each digit rise to the power of count of digit is also a same number.
// example : 153 count=3, 1+125+27.

import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(sum(num)==num){
            System.out.println("The "+num+" is Armstrong number");
        }else{
            System.out.println("The "+num+" is not Armstrong number");
        }
    }

    public static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }

    public static int exponential(int base,int power){
        int expo=1;
        for(int i=1;i<=power;i++){
            expo*=base;
        }
        return expo;
    }

    public static int sum(int n){
        int sum=0;
        int c=count(n);
        while(n>0){
            int lastDigit=n%10;
            sum=sum+exponential(lastDigit, c);
            n/=10;
        }
        return sum;
    }
}