class AverageArray{
    public static void main(String[] args) {
        int[] arr={1,2,342,4,5,6};
        int sum=0;
        int length=arr.length;
        for(int i:arr){
            sum+=i;
        }
        int avg=sum/length;
        System.out.println("Average of an array is :"+avg);
    }
}