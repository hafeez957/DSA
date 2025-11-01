
// Multiply odd indexed elements by 2 and add 10 to even indexed elements

class OddAndEven{
    public static void main(String[] args) {
        int arr[]={2,3,4,34,12,45,23};
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                arr[i]*=2;
            }else{
                arr[i]+=10;
            }
            System.out.print(arr[i]+" ");
        }
    }
}