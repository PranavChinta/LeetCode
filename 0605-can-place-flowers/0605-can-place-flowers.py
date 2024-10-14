class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        count = 0
        size = len(flowerbed)
        if(n==0):
            return True
        for i in range(size):
            if((i==0 or flowerbed[i-1] == 0) and (i==size-1 or flowerbed[i+1] == 0) and flowerbed[i] == 0):
                flowerbed[i] = 1
                count += 1
                if(count == n):
                    return True

        return False

         