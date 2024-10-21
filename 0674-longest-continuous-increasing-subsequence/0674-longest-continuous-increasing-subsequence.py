class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        n = len(nums)
        length = 0
        maxLen = 1
        for i in range(n):
            if(i == 0):
                length += 1
            else:
                if(nums[i-1] < nums[i]):
                    length += 1
                    maxLen = max(maxLen, length)
                else:
                    length = 1 
            print(i)
        return maxLen