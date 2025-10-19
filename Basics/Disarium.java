
//Disarium: Sum of each digits to the exponential of its position is also a same number.
// example : 135= (1^1)+(3^2)+(5^3)=1+9+125=135

import java.util.Scanner;

class Disarium{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(sumOfEachDigit(num)==num){
            System.out.println("The "+num+" is Disarium number");
        }else{
            System.out.println("The "+num+" is not a Disarium number");
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

    public static int expo(int base,int power){
        int e=1;
        for(int i=1;i<=power;i++){
            e*=base;
        }
        return e;
    }

    public static int sumOfEachDigit(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=sum+expo(lastDigit,count(n));
            n/=10;
        }
        return sum;
    }
}