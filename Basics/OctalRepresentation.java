
//Octal representation of a number

import java.util.Scanner;

class OctalRepresentation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Octal representation of "+num+" is "+octal(num));
    }

    public static String octal(int n){
        String oct="";
        while(n>0){
            int lastDigit=n%8;
            oct+=lastDigit;
            n/=8;
        }
        return oct;
    }
}