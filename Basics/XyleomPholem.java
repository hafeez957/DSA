
//Xyleom :- Sum of mean digits is equal to sum of extreme digits
            // mean digits like in a number 1234 :-  2+3=5
            // extreme digits is in a number 1234 :- 1+4=5
//Pholem :- Sum of mean digits is not equal to sum of extreme digits

import java.util.Scanner;

class XyleomPholem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isXyleomPholem(num)){
            System.out.println("The "+num+" is Xyleom Number");
        }else{
            System.out.println("The "+num+" is Pholem Number");
        }
    }

    public static boolean isXyleomPholem(int n){
        
        int sumOfMean=0;
        int sumOfExtreme;
        int ld=n%10;
        n/=10;
        while(n>9){
            int lastDigit=n%10;
            sumOfMean+=lastDigit;
            n/=10;
        }
        sumOfExtreme=ld+n;
        return sumOfMean==sumOfExtreme;
    }
}