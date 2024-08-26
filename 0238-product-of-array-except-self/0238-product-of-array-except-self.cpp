class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size = nums.size();
        vector<int> ret = {};
        ret.push_back(1);
        
        //prefix array
        for(int i = 1; i < size; i++){
            ret.push_back(nums[i-1] * ret[i-1]);
        }
        
        //suffix array: keep last element as is(mult. by 1)
        int suffix = 1;
        for(int i = size-1; i >= 0; i--){
            ret[i] *= suffix;
            suffix *= nums[i];
        }
        return ret;
    }
};