
import java.util.Scanner;

class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary code");
        int bin=sc.nextInt();
       System.out.println("Decimal number of "+bin+" is "+decimal(bin));
    }

    public static int decimal(int n){
        int decimal=0;
        int exponential=1;
        while(n>0){
            int lastDigit=n%10;
            decimal=decimal+(lastDigit*exponential);
            exponential*=2;
            n/=10;
        }
        return decimal;
    }
}