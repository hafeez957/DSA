class ReverseHalfArray{
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,9,3,8};
        int i=0;
        int j=arr.length/2-1;
        reverse(arr, i, j);
        reverse(arr, j+1, arr.length-1);
        
        System.out.println("Half Reversed Array is : ");
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }

    public static int[] reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}