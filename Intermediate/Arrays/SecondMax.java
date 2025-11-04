
// Second Max element in an array

class SecondMax{
    public static void main(String[] args) {
        int arr[]={3,24,54,64,9,23};
        int max=-0;
        int secondMax=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                continue;
            }
            if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("Second max element is : "+secondMax);
    }
}