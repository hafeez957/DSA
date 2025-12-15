
// Selection sort

import java.util.Arrays;

class SelectionSort{
    public static void main(String[] args) {
        int[] a={1,32,4,2,8,4,6,0};
        for(int i=0;i<a.length-1;i++){
            int ind=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[ind]){
                    ind=j;
                }
            }
            if(ind!=i){
                int temp=a[i];
                a[i]=a[ind];
                a[ind]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}