
// Sum of Primary Diagonal and Secondary Diagonal

class sumOfPrimaryAndSecondaryDiagonal{
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sumOfPrimaryDiagonal=0,sumOfSecondaryDiagonal=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    sumOfPrimaryDiagonal+=a[i][j];
                }
                if(i+j==a.length-1){
                    sumOfSecondaryDiagonal+=a[i][j];
                }
            }
        }
        System.out.println("Sum of Primary Diagonal is :"+sumOfPrimaryDiagonal);
        System.out.println("Sum of Secondary Diagonal is :"+sumOfSecondaryDiagonal);
    }
}