
// Rotating an array

class RotateArray{
    public static void main(String[] args) {
        int[] arr={43,64,23,98,12,43};
        int r=4;
        int i=0;
        int j=arr.length;
        r%=j;
        reverse(arr, i,r-1);
        reverse(arr, r,j-1);
        reverse(arr, i,j-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}