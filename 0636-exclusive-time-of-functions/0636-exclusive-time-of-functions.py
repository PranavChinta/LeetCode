from collections import deque

class Solution:
    def exclusiveTime(self, n: int, logs: List[str]) -> List[int]:
        times = [0] * n
        call_stack = []
        prevStartTime = 0

        for process in logs:
            parsed = process.split(":")
            funcID = int(parsed[0])
            state = parsed[1]
            timestamp = int(parsed[2])

            if(state == "start"):
                if(call_stack): #another function running before
                    prevID = call_stack[-1]
                    times[prevID] += (timestamp-prevStartTime)
                
                call_stack.append(funcID)
                prevStartTime = timestamp
            
            else: #end function
                times[funcID] += (timestamp-prevStartTime+1)
                call_stack.pop()
                prevStartTime = timestamp+1

        return times    