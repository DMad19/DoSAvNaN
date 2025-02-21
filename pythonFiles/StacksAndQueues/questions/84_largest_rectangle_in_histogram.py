class Solution:
    def largestRectangleArea(self, heights) -> int:
        left = nearest_smaller_to_left(heights)
        right = nextSmallerElement(heights)
        maxi = 0
        for i in range(len(heights)):
            ansAtI = 0
            if left[i]==-1:
                ansAtI = i*heights[i]
            else:
                ansAtI = (i-left[i]-1)*heights[i]
            if right[i]==-1:
                ansAtI += (len(heights)-i-1)*heights[i]
            else:
                ansAtI += (right[i]-i-1)*heights[i]
            ansAtI += heights[i]
            if ansAtI>maxi:
                maxi = ansAtI
        return maxi


def nearest_smaller_to_left(nums):
        ans = []
        stack = []
        for i in range(len(nums)):
            while(len(stack)>0 and nums[stack[-1]]>=nums[i]):
                stack.pop()
            if len(stack)==0:
                ans.append(-1)
            else:
                ans.append(stack[-1])
            stack.append(i)
        return ans

def nextSmallerElement(nums):
    # code here
    ans = []
    stack = []
    for i in range(len(nums)-1,-1,-1):
        while(len(stack)>0 and nums[stack[-1]]>=nums[i]):
            stack.pop()
        if len(stack)==0:
            ans.append(-1)
        else:
            ans.append(stack[-1])
        stack.append(i)
    return ans[::-1]