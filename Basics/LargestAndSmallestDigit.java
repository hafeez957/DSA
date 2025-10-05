//Largest and smallest digits from a number
import java.util.Scanner;

class LargestAndSmallestDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        large(num);
    }

    public static void large(int n){
        int largeDigit=0;
        int smallestDigit=9;
        while(n>0){
            int lastDigit=n%10;
            if(largeDigit<lastDigit)
                largeDigit=lastDigit;
            if(smallestDigit>lastDigit)
                smallestDigit=lastDigit;
            n/=10;
        }
       System.out.println("Largest digit is "+largeDigit);
       System.out.println("Smallest digit is "+smallestDigit);
    }
}