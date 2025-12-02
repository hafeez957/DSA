
// find sum of each column in 2D Array

class ColumnSumIn2D{
    public static void main(String[] args) {
        int[][] a={
            {1,2,3,4},
            {4,5,6,7},
            {8,9,3,1}
        };
        for(int i=0;i<a[0].length;i++){
            int sum=0;
            for(int j=0;j<a.length;j++){
                sum+=a[j][i];
            }
            System.out.println((i+1)+" th column sum is :"+sum);
        }
    }
}