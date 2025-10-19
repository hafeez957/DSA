
// Harshad Number : A number which is divisible by sum of its digits

import java.util.Scanner;

class Harshad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num%isHarshad(num)==0)
            System.out.println("The "+num+" is a Harshad number");
        else
            System.out.println("The "+num+" is not a Harshad number");
    }

    public static int isHarshad(int n){
        if(n==0){
            return 0;
        }else{
            return (n%10)+isHarshad(n/10);
        }
    }
}