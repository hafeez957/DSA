
// Searching element in an array

import java.util.Scanner;

class SearchAnElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Entering the size of an array
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        // Entering the elements of array
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // Displaying the elements 
        System.out.println("Elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // element to be search
        System.out.println("Enter the element to be search");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Element is present at index: "+i);
                found=true;
            }
             
        }
        if(!found)
            System.out.println("Element not found");
    }
}