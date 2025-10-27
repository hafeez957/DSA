
// Lower Right Triangle Alphabetical Pattern

class LowerRightAplhabeticalTriangle{
    public static void main(String[] args) {
        int star=1;
        int space=4;
        char c='A';
       for(int r=1;r<=5;r++){
         for(int i=1;i<=space;i++){
            System.out.print("   ");
        }
        for(int i=1;i<=star;i++){
            System.out.print(" "+(c++)+" ");
        }
        System.out.println();
        star++;
        space--;
        c='A';
       }
    }
}