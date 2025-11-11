
// an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

class Segregate0and1{
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,0,0,1,0,0,1};
        int zero=0;
        int one=0;
        for (int ele : arr) {
            if(ele==0){
                zero++;
            }else{
                one++;
            }
        }
        for(int i=0;i<=zero;i++){
            arr[i]=0;
        }
        for(int i=one;i<arr.length;i++){
            arr[i]=1;
        }
        for (int elem : arr) {
            System.out.print(elem+" ");
        }
    }
}