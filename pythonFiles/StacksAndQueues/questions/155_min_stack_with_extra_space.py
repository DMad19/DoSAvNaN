# https://leetcode.com/problems/min-stack/description/

class MinStack:

    def __init__(self):
        self.ss = []
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        if(len(self.ss)==0 or val<=self.ss[-1]):
            self.ss.append(val)

    def pop(self) -> None:
        if self.stack:
            ans = self.stack.pop()
            if ans == self.ss[-1]:
                self.ss.pop()

    def top(self) -> int:
        if self.stack:
            return self.stack[-1]
        return -1

    def getMin(self) -> int:
        if(len(self.ss)==0):
            return -1
        return self.ss[-1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()