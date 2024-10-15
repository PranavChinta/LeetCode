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
        i = 0
        write = 0
        while i < len(chars):
            string = chars[i]
            num = self.consecutiveLength(string, i, chars) #check num digits
            if(num == 1):
                chars[write] = string
                write += 1
            else:
                chars[write] = string
                write += 1
                stringNum = str(num)
                for j in range(len(stringNum)):
                    char = stringNum[j]
                    chars[write] = char
                    write += 1
                i += (num-1)
            i += 1

        return write
                
        

