import java.util.Scanner;
class Factorial{
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
    }
}