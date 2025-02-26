class Solution:
    def maxOfMins(self, arr):
        left = getMinToLeft(arr)
        right = getMinToRight(arr)
        ans = [0]*len(arr)
        for i in range(len(arr)):
            index = right[i]-left[i]-2
            ans[index] = max(ans[index],arr[i])
        
        for i in range(len(arr)-2,-1,-1):
            ans[i] = max(ans[i],ans[i+1])
        return ans

def getMinToLeft(arr):
    ans = []
    stack = []
    for i in range(len(arr)):
        while(stack and arr[stack[-1]]>=arr[i]):
            stack.pop()
        if stack:
            ans.append(stack[-1])
        else:
            ans.append(-1)
        stack.append(i)
    return ans
    
def getMinToRight(arr):
    ans = []
    stack = []
    for i in range(len(arr)-1,-1,-1):
        while(stack and arr[stack[-1]]>=arr[i]):
            stack.pop()
        if stack:
            ans.append(stack[-1])
        else:
            ans.append(len(arr))
        stack.append(i)
    return ans[::-1]