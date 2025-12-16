
// Reversing Each and Every row elements

import java.util.Arrays;

class ReverseRowElements{
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int[] arr:a){
            reverse(arr);
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void reverse(int[] a){
        int i=0, j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
}