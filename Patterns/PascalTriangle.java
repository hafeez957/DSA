
// Pascal Triangle Pattern

class PascalTriangle{
    public static void main(String[] args) {
        // int num=0;
        int space=3;
        for(int r=0;r<=4;r++){
            for(int i=0;i<=space;i++){
                System.out.print(" ");
            }
            for(int i=0;i<=r;i++){
                System.out.print(" "+combination(r, i));
            }
            System.out.println();
            // num++;
            space--;
        }
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }

    public static int combination(int n,int r){
        int c=factorial(n)/(factorial(n-r)*factorial(r)); // Pascal formula
        return c;
    }
}