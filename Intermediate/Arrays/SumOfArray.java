
// sum of an array

class SumOfArray{
    public static void main(String[] args) {
        int arr[]={2,34,-14,43,-3,2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array is "+sum);
    }
}