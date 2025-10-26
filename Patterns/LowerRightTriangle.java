class LowerRightTriangle{
    public static void main(String[] args) {
        int star=1;
        int space=4;
       for(int r=1;r<=5;r++){
         for(int i=1;i<=space;i++){
            System.out.print("   ");
        }
        for(int i=1;i<=star;i++){
            System.out.print(" * ");
        }
        System.out.println();
        star++;
        space--;
       }
    }
}