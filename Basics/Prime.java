
//Prime number :- A number which is divisible by 1 and itself.

import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(countOfFactors(num)==2)
            System.out.println("The "+num+" is Prime number");
        else
            System.out.println("The "+num+" is not a Prime number");
    }

    public static int countOfFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return count;
    }
}