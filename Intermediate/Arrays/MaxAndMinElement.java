
// Displaying maximum and minimum element in an array

class MaxAndMinElement{
    public static void main(String[] args) {
        int arr[]={23,2,-10,45,0,32,9};
        int max=0;
        int min;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        min=max;
        for(int j=0;j<arr.length;j++){
                if(arr[j]<min)
                    min=arr[j];
            }
        System.out.println("Max element in an array is "+max);
        System.out.println("Min element in an array is "+min);
    }
}