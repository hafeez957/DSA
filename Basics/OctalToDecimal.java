
import java.util.Scanner;

class OctalToDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Octal code");
        int octal=sc.nextInt();
        System.out.println("Decimal number of "+octal+" is "+decimal(octal));
    }

    public static int decimal(int n){
        int decimal=0;
        int exponential=1;
        while(n>0){
            int lastDigit=n%10;
            decimal=decimal+(lastDigit*exponential);
            exponential*=8;
            n/=10;
        }
        return decimal;
    }
}