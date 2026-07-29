class Solution {
    public int maxProfit(int[] prices) {
         int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,maxProfit=0;
      for(int i=0;i<prices.length;i++){
        if(min>prices[i]){
            min=prices[i];
        }
        else{
            maxProfit=Math.max(maxProfit,prices[i]-min);
        }
      }
      return maxProfit;
    }
}
