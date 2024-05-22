class Solution {
   public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
        int val = nums[i];
        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
    }
    return memo[nums.length];
}
}

//my solution where leetcode times out with recursion, above is accepted solution from discussion
/*
class Solution {
    public int DP(int[] nums, int j){
        if(j+1 < 1){
            return 0;
        }
        if(j+1==1){
            return nums[0];
        }
        if(j+1==2){
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(nums[j]+DP(nums, j-2), nums[j-1]+DP(nums, j-3));
    }
    public int rob(int[] nums) {
        int size = nums.length;
        //int[] OPT = new int[size];
        return DP(nums, size-1);
    }
}
*/
