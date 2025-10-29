
// Hour Glass or Sand Glass star Pattern

class HourGlass{
    public static void main(String[] args) {
        int star=9;
        int space=0;
       for(int r=1;r<=9;r++){
         for(int i=1;i<=space;i++){
            System.out.print("   ");
        }
        for(int i=1;i<=star;i++){
            System.out.print(" * ");
        }
        System.out.println();
        if(r<5){
            star-=2;
            space++;
        }else{
            star+=2;
            space--;
        }
       }
    }
}