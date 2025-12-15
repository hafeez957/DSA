
// Insertion sort

import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args) {
        int[] a={1,32,4,2,8,4,6,0};
        for(int i=0;i<a.length;i++){
            int t=a[i];
            int j=i-1;
            while(j>=0 && a[j]>t){
                a[j+1]=a[j];
                j--;
            }
            if(j+1!=i){
                a[j+1]=t;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}