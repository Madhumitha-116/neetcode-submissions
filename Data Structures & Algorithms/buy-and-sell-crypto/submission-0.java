class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=Integer.MIN_VALUE;
       int minprice=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
        int price=prices[i];
        if(price<minprice)
        {
            minprice=price;
        }
        int profit=price-minprice;
        maxprofit=Math.max(maxprofit,profit);
       }
       return maxprofit== Integer.MIN_VALUE?0:maxprofit;
    }
}
