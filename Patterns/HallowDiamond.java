
// Hallow Diamond Star Pattern

class HallowDiamond{
    public static void main(String[] args) {
        int a=7;
        int b=7;
       for(int i=1;i<=13;i++){
          for(int j=1;j<=13;j++){
            if(j==a||j==b){
                System.out.print(" * ");
            }else{
                System.out.print("   ");
            }
          }
        System.out.println();
        if(i<7){
            a--;
            b++;
        }else{
            a++;
            b--;
        }
        }
    }
}