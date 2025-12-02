
//  maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

class MaxProfitInStock{
    public static void main(String[] args) {
        int[] prices={3, 2, 6, 1, 4};
        int n=prices.length;
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            if(prices[i]<min){
                min=prices[i];
                index=i;
            }
        }
        
        int max=min;

        for(int i=index;i<n;i++){
            if(prices[i]>max)
                max=prices[i];
        }
        int profit=max-min;
        if(min>max)
            profit=0;
        
        System.out.println(profit);
        System.out.println(min);
        System.out.println(max);
        System.out.println(index);
    }
}