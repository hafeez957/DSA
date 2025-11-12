
// adding 1 to array

import java.util.ArrayList;
import java.util.Collections;

class AddingOne{
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr={9,9,9};
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1) ans.add(carry);

        Collections.reverse(ans);
        for (int elem : ans) {
            System.out.print(elem+" ");
        }
    }
}