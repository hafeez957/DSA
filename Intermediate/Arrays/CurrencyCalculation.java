class CurrencyCalculation{
    public static void main(String[] args) {
        int[] notes={500,200,100,50,20,10,5,2,1};
        int amount=5590;
        for(int i=0;i<notes.length;i++){
            int count=amount/notes[i];
            if(count>0){
                System.out.println(notes[i]+" ruppes notes :"+count);
                amount=amount%notes[i];
            }
        }
    }
}