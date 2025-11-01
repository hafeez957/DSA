
// Displaying maximum element in an array

class MaximumElement{
    public static void main(String[] args) {
        int arr[]={23,2,45,0,32,9};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Max element of an array is "+max);
    }
}