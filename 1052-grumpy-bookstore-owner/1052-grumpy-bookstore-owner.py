class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        alwaysSatisfied = sum(customers[i] for i in range(len(customers)) if grumpy[i] == 0)

        windowSum = 0
        maxNotGrumpy = 0
        for i in range(len(grumpy)):
            if grumpy[i] == 1:
                windowSum += customers[i]
            if(i >= minutes and grumpy[i-minutes] == 1):
                windowSum -= customers[i-minutes]
            maxNotGrumpy = max(maxNotGrumpy, windowSum)

        return alwaysSatisfied + maxNotGrumpy

