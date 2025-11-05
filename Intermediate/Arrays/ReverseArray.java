
// Reversing an Array elements

class ReverseArray{
    public static void main(String[] args) {
        int[] arr={12,432,56,86,34,21,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}