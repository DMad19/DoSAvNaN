# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/next-larger-element-1587115620
# POTD 23-02-2025

class Solution:
    # Function to find the next greater element for each element of the array.
    def nextLargerElement(self, arr):
        # code here
        stack = []
        ans = []
        for i in range(len(arr)-1,-1,-1):
            while(len(stack)>0 and stack[-1]<=arr[i]):
                stack.pop()
            if stack:
                ans.append(stack[-1])
            else:
                ans.append(-1)
            stack.append(arr[i])
        return ans[::-1]