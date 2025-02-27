# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/get-minimum-element-from-stack
# POTD 27-02-2025

class Solution_with_extra_space:

    def __init__(self):
        # code here
        self.stack = []
        self.minStack = []
    # Add an element to the top of Stack
    def push(self, x):
        # code here
        self.stack.append(x)
        if(not self.minStack or (self.minStack and self.stack[-1]<=self.minStack[-1])):
            self.minStack.append(x)
    # Remove the top element from the Stack
    def pop(self):
        # code here
        if(self.minStack and self.stack[-1]==self.minStack[-1]):
            self.minStack.pop()
        if self.stack:
            self.stack.pop()
    # Returns top element of Stack
    def peek(self):
        # code here
        if self.stack:
            return self.stack[-1]
        return -1
    # Finds minimum element of Stack
    def getMin(self):
        # code here
        if not self.minStack:
            return -1
        return self.minStack[-1]
    
class Solution_with_constant_space:

    def __init__(self):
        # code here
        self.stack = []
        self.mini = None
    # Add an element to the top of Stack
    def push(self, x):
        # code here
        if not self.stack:
            self.mini = x
            self.stack.append(x)
        elif(x<self.mini):
            self.stack.append((x*2) - self.mini)
            self.mini = x
        else:
            self.stack.append(x)
    # Remove the top element from the Stack
    def pop(self):
        # code here
        if not self.stack:
            return
        
        top = self.stack.pop()
        if top<self.mini:
            self.mini = 2 * self.mini - top
        
    # Returns top element of Stack
    def peek(self):
        # code here
        if self.stack:
            if self.stack[-1]<self.mini:
                return self.mini
            return self.stack[-1]
        return -1
        
    # Finds minimum element of Stack
    def getMin(self):
        # code here
        if not self.stack:
            return -1
        return self.mini