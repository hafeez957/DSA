
import java.util.Scanner;


//Perfect Number is a number which is equal to sum of factors of it. Excluding the number.
//example 6 => factors are 1 2 3 and sum of factors is 1+2+3=6 like 28 and 496 is also perfect number.

class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(sumOfFactors(num)==num)
            System.out.println("The "+num+" is Perfect Number");
        else
             System.out.println("The "+num+" is not a Perfect Number");
    }

    public static int sumOfFactors(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}