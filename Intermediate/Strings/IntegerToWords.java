
// Converting Integer to Englis Words

import java.util.Scanner;

class IntegerToWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String teens[] = {"", "Eleven", "Twelve", "Thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        System.out.println("Enter any amount");
        int n = sc.nextInt();

        String res = "";
        while (n != 0) {
            if (n <= 9) {
                res += ones[n] + " ";
                n = 0;
            } else if (n <= 19) {
                if (n == 10) {
                    res += tens[1] + " ";
                } else {
                    res += teens[n % 10] + " ";
                }
                n = 0;
            } else if (n <= 99) {
                res += tens[n / 10] + " ";
                n = n % 10;
            } else if (n <= 999) {
                res += ones[n / 100] + " Hundred ";
                n = n % 100;
            } else if (n <= 9999) {
                res += ones[n / 1000] + " Thousand ";
                n = n % 1000;
            }
        }
        System.out.println(res);
    }
}
