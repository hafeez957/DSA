
// Finding frenquency or occurrence of elements in an Array

class FrequencyOfElements{
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,3,2,8,7,0,8,7,1};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cd=1;
            if(arr[i]!=Integer.MIN_VALUE){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        arr[j]=Integer.MIN_VALUE;
                        cd++;
                    }
                }
            }
            if(arr[i]!=Integer.MIN_VALUE)
                System.out.println(arr[i]+" is present "+cd+" times");
        }
    }
}