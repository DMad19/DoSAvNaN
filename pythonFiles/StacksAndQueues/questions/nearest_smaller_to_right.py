def nextSmallerElement(nums):
    # code here
    ans = []
    stack = []
    for i in range(len(nums)-1,-1,-1):
        while(len(stack)>0 and stack[-1]>=nums[i]):
            stack.pop()
        if len(stack)==0:
            ans.append(-1)
        else:
            ans.append(stack[-1])
        stack.append(nums[i])
    return ans[::-1]

print(nextSmallerElement([0,0,0,5,4,3,2,1]))