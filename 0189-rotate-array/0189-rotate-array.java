class Solution {
    public void reverse(int[] nums, int lower, int upper){
        int left = lower;
        int right = upper;
        while(left < right){
            int leftCpy = nums[left];
            int rightCpy = nums[right];
            nums[left] = rightCpy;
            nums[right] = leftCpy;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
      k = k%nums.length;
      int[] ret = new int[nums.length];
      reverse(nums, 0, nums.length-1);
      reverse(nums, 0, k-1);
      reverse(nums, k, nums.length-1);
      }
}