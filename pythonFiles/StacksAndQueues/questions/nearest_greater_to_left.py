def nearest_greater_to_left(nums):
        ans = []
        stack = []
        for i in range(len(nums)):
            while(len(stack)>0 and stack[-1]<=nums[i]):
                stack.pop()
            if len(stack)==0:
                ans.append(-1)
            else:
                ans.append(stack[-1])
            stack.append(nums[i])
        return ans
print(nearest_greater_to_left([0,4,1,2,3,4]))