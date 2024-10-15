class Solution:

    def consecutiveLength(self, string: str, index: int, chars: List[str]) -> int:
        i = index
        char = chars[i]
        count = 1
        while(i+1 < len(chars)):
            if(chars[i+1] == char):
                count += 1
            else:
                break
            i += 1
        return count

    def compress(self, chars: List[str]) -> int:
        s = ""
        i = 0
        while i < len(chars):
            string = chars[i]
            num = self.consecutiveLength(string, i, chars) #check num digits
            if(num == 1):
                s += string
            else:
                s += string
                stringNum = str(num)
                for j in range(len(stringNum)):
                    char = stringNum[j]
                    s += char
                i += (num-1)
            i += 1
        
        chars.clear()
        for char in s:
            chars.append(char)

        return len(s)
                
        

