class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        kSum = sum(nums[:k])
        maxSum = kSum
        i = 1
        while (i+k-1) < len(nums):
            kSum += nums[i+k-1]
            kSum -= nums[i-1]
            if kSum > maxSum:
                maxSum = kSum
            i += 1
        return maxSum/k

        