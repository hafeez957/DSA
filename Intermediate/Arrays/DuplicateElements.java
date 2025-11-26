
// Removing Dulplicate elements in an Array

import java.util.Arrays;

class DuplicateElements{
    public static void main(String[] args) {
        int[] arr={1,2,1,3,42,3,2,8,4,9,8,4};
        int n=arr.length;
        int cd=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MIN_VALUE){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        arr[j]=Integer.MIN_VALUE;
                        cd++;
                    }
                }
            }
        }
        int[] arr2=new int[n-cd];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=Integer.MIN_VALUE)
                arr2[j++]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}