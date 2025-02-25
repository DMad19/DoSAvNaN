# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/maximum-rectangular-area-in-a-histogram-1587115620
# POTD 25-02-2025

class Solution:
    def getMaxArea(self,arr):
        #code here
        stack = []
        left = getSmallestToLeft(arr)
        right = getSmallestToRight(arr)
        maxi = 0
        for i in range(len(arr)):
            area = (right[i]-left[i]-1)*arr[i]
            maxi = max(area,maxi)
        return maxi
def getSmallestToLeft(arr):
    stack = []
    ans = []
    for i in range(len(arr)):
        while(len(stack)>0 and arr[stack[-1]]>=arr[i]):
            stack.pop()
        if stack:
            ans.append(stack[-1])
        else:
            ans.append(-1)
        stack.append(i)
    return ans
    
def getSmallestToRight(arr):
    stack = []
    ans = []
    for i in range(len(arr)-1,-1,-1):
        while(len(stack)>0 and arr[stack[-1]]>=arr[i]):
            stack.pop()
        if stack:
            ans.append(stack[-1])
        else:
            ans.append(len(arr))
        stack.append(i)
    return ans[::-1]