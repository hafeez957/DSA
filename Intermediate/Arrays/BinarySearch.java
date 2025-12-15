
// Binary Search

class BinarySearch{
    public static void main(String[] args){
        int[] a={1,2,3,5,7,9};
        int target=23;
        if(isBinary(a, target)){
            System.out.println("element found");
        }else
            System.out.println("element not found");
        
    }

    public static boolean isBinary(int[] a,int target){
        int low=0,high=a.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mid==target)
                return true;
            else if(mid<target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }

}