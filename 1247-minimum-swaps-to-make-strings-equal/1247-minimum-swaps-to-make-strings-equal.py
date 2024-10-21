class Solution:
    def minimumSwap(self, s1: str, s2: str) -> int:
        xy = 0
        yx = 0
        for c1, c2 in zip(s1, s2):
            if(c1 == "x" and c2 == "y"):
                xy += 1
            if(c1 == "y" and c2 == "x"):
                yx += 1
        
        swaps = (xy//2) + (yx//2)
        remXY = xy%2
        remYX = yx%2
        if((remXY+remYX)%2 == 0):
            return swaps + (remXY+remYX)
        else:
            return -1


