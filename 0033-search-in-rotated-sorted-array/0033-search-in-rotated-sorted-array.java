class Solution {
    
    public int pivotIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int size = nums.length;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){//left half is sorted
                if(target>nums[mid] || target < nums[left]){//target in right half
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else{//right half is sorted
                if(target < nums[mid] || target > nums[right]){//target in left half
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        return pivotIndex(nums, target);
    }
}