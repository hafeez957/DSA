// Program for counting number of factors of a given number

import java.util.Scanner;

class CountOfFactors{
    public static int counting(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("count of factors of "+num+" is "+counting(num));
    }
}