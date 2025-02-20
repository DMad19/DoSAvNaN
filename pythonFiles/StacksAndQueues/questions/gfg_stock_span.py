# https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
def calculateSpan(self, nums):
    ans = []
    stack = []
    for i in range(len(nums)):
        while(len(stack)>0 and nums[stack[-1]]<=nums[i]):
            stack.pop()
        if len(stack)==0:
            ans.append(i+1)
        else:
            ans.append(i - stack[-1])
        stack.append(i)
    return ans