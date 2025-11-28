
import java.util.Arrays;

class Moving0sToLast{
    public static void main(String[] args) {
        int[] arr={0,0,1,0,3,0,4,2,0,5,0,7,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}