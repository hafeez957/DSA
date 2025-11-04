
// Displaying the indexes of the sum of the elements

class TwoSum{
    public static void main(String[] args) {
        int arr[]={2,4,6,3,8,5};
        int target=7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}