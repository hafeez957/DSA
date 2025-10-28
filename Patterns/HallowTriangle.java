
// Hallow Triangle Star Pattern

class HallowTriangle{
    public static void main(String[] args) {
        int a=7;
        int b=7;
       for(int i=1;i<=7;i++){
          for(int j=1;j<=13;j++){
            if(j==a||j==b||i==7){
                System.out.print(" * ");
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