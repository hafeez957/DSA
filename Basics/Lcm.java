// Lcm of two numbers

 import java.util.Scanner;

class Lcm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Lcm of "+a+" and "+b+" is "+findLcm(a,b));
    }
    public static int findLcm(int a,int b){
        int lcm=0;
        int gcd=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
                gcd=i;
           
        }
        lcm=(a*b)/gcd;
         return lcm;
    }
}

