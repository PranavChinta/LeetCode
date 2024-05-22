class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len==0){
            return 0;
        }
        int[] left = new int[len];
        int[] right = new int[len];

        //filling in 1st transaction, finding the best 1st transaction
        int leftMin = prices[0];
        for(int i = 1; i < len; i++){
            left[i] = Math.max(prices[i]-leftMin, left[i-1]);
            leftMin = Math.min(leftMin, prices[i]);
        }

        //filling in 2nd transaction, finding the best 2nd transaction
        int rightMax = prices[len-1];
        for(int i = len-2; i >= 0; i--){
            right[i] = Math.max(rightMax-prices[i], right[i+1]);
            rightMax = Math.max(rightMax, prices[i]);
        }

        //finding the maximum profit
        int profit = right[0];
        for(int i = 1; i < len; i++){
            profit = Math.max(left[i-1]+right[i], profit);
        }
        return profit;
    }
}