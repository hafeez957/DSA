// Greatest common divisor or Highest common factor

import java.util.Scanner;

class Gcd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Gcd of "+a+" and "+b+" is "+findGcd(a,b));
    }
    public static int findGcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
           
        }
         return gcd;
    }
}