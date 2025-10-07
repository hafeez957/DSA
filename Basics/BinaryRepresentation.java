
import java.util.Scanner;

class BinaryRepresentation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Binary Representation of "+num+" is "+binary(num));

    }
    public static String binary(int n){
        String bin="";
        while(n>0){
            int lastDigit=n%2;
            bin+=lastDigit;
            n/=2;
        }
        return bin;
    }
}