
// Unique Number : A number where it doesn't consist of repeated digits.

import java.util.Scanner;

class Unique{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numner");
        int num=sc.nextInt();
        if(isUnique(num))
            System.out.println("The "+num+" is a Unique Number");
        else
            System.out.println("The "+num+" is not a Unique Number");
    }

    public static boolean isUnique(int n){
        while(n>0){
            int lastDigit1=n%10;
            n/=10;
            int temp=n;
            while(temp>0){
                int lastDigit2=temp%10;
                if(lastDigit1==lastDigit2)
                    return false;
                temp/=10;
            }
        }
        return true;
    }
}