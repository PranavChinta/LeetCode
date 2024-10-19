class Solution:
    def minimumLength(self, s: str) -> int:

        mp = defaultdict(int)
        for letter in s:
            mp[letter] += 1
        
        
        for letter in mp:
            while(mp[letter] >= 3):
                mp[letter] -= 2

        return sum(mp.values())