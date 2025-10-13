// Automorphic Number :- A number after squaring also end with the same.
// like 25 square is 625 

import java.util.Scanner;

class Automorphic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int square=num*num;
        if(isAutomorphic(num, square))
            System.out.println("The "+num+" is Automorphic number");
        else
            System.out.println("The "+num+" is not a Automorphic number");
    }

    public static boolean isAutomorphic(int n,int sq){
        while(n>0){
            int lastDigit1=n%10;
            int lastDigit2=sq%10;
            if(lastDigit1!=lastDigit2)
                return false;
            n/=10;
            sq/=10;
        }
        return true;
    }
}