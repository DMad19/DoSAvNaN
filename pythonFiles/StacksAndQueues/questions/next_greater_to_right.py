# https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
class Solution:
    # Function to find the next greater element for each element of the array.
    def nextLargerElement(self, nums):
        # code here
        ans = []
        stack = []
        for i in range(len(nums)-1,-1,-1):
            while(len(stack)>0 and stack[-1]<=nums[i]):
                stack.pop()
            if len(stack)==0:
                ans.append(-1)
            else:
                ans.append(stack[-1])
            stack.append(nums[i])
        return ans[::-1]