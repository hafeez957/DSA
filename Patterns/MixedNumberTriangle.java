
//  Mixed Number Triangle Pattern

class MixedNumberTriangle{
    public static void main(String[] args) {
        int a=5,b=5;
        for(int i=1;i<=5;i++){
            int n=i;
            for(int j=1;j<=9;j++){
                if(j>=a && j<=b){
                    if(j<5){
                        System.out.print(" "+(n--)+" ");
                    }else{
                        System.out.print(" "+(n++)+" ");
                    }
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            a--;
            b++;
        }
    }
}