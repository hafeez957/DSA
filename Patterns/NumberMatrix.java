
// Number Matrix Pattern is also knows as  Row-Column Sum Pattern

class NumberMatrix{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(((i+j)-2)+" ");                 
            }
            System.out.println();
        }
    }
}


// Alternate Way

/* class NumberMatrix{
     public static void main(String[] args) {
        int n=0;
         for(int i=1;i<=5;i++){
            int temp=n;
            for(int j=1;j<=5;j++){
                System.out.print((temp++)+" ");                 
            }
            System.out.println();
            n++;
         }
     }
 }*/