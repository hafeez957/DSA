
// Finding exponential value of a number

import java.util.Scanner;

class Exponential{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a base number");
        int base=sc.nextInt();
        System.out.println("Enter power value");
        int power=sc.nextInt();
        System.out.println("Exponential value is "+exponential(base, power));
    }

    public static int exponential(int b,int p){
        int expo=1;
        for(int i=1;i<=p;i++){
            expo=expo*b;
        }
        return expo;
    }
}