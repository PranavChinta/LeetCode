class Solution:
    def minOperations(self, nums: List[int], queries: List[int]) -> List[int]:

        numsCopy = nums.copy()
        numsCopy.sort()
        prefixSum = [0] + list(accumulate(numsCopy))
        numsLen = len(nums)
        queryWithPos = []
        minOperations = []
        for query in queries:
            queryWithPos.append((query, bisect_left(numsCopy, query)))

        for query, pos in queryWithPos:
            changesBefore = (query*pos) - prefixSum[pos]
            changesAfter = ((prefixSum[-1] - prefixSum[pos]) - (query*(numsLen-pos)))
            minOperations.append(changesBefore + changesAfter)
    
        return minOperations

