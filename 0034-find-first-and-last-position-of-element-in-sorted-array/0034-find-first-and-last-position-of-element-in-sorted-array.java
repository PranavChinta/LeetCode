class Solution {
    
    public int findEarliest(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int earliest = -1;
        int mid1 = 0;
        while(left <= right){
            mid1 = (left+right)/2;
            if(nums[mid1]<target){
                left = mid1+1;
            }
            else if(nums[mid1]>target){
                right = mid1-1;
            }
            else{//nums[mid1]==target
                earliest = mid1;
                right = mid1-1;
            }
        }
        return earliest;
    }
    public int findLatest(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int latest = -1;
        int mid1 = 0;
        while(left <= right){
            mid1 = (left+right)/2;
            if(nums[mid1]<target){
                left = mid1+1;
            }
            else if(nums[mid1]>target){
                right = mid1-1;
            }
            else{//nums[mid1]==target
                latest = mid1;
                left = mid1+1;
            }
        }
        return latest;
    }
    
    
    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];
        int startIdx = findEarliest(nums, target);
        int endIdx = findLatest(nums, target);
        index[0] = startIdx;
        index[1] = endIdx;
        return index;
    }
}