
// adding element into a particular index in an array

import java.util.Arrays;
import java.util.Scanner;

class InsertingElementInArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,5,2,8,4};
        System.out.println("Enter the index to insert an element");
        int ind=sc.nextInt();
        if(ind>=0&&ind<arr.length){
            System.out.println("Enter the element to insert");
            int ele=sc.nextInt();
            int res[]=new int[arr.length+1];
            int j=0;
            for(int i=0;i<res.length;i++){
                if(i==ind){
                    res[i]=ele;}
                else{
                    res[i]=arr[j++];}
            }
            System.out.println(Arrays.toString(res));
        }else{
            System.out.println("Invalid Index");
        }
    }
}