class Solution {
    public int maxProfit(int[] prices) {
        int ans=prices[0];
        int count=0;
        for(int i=1;i<prices.length;i++){
            if(ans<prices[i]){
                count=Math.max(count,prices[i]-ans);
            }
            else{
                ans=prices[i];
            }
        }
        return count;
    }
}