# https://leetcode.com/problems/maximal-rectangle/
class Solution:
    def maximalRectangle(self, matrix):
        arr = None
        if matrix:
            arr = [0]*len(matrix[0])
        maxi = 0
        for row in matrix:
            for i in range(len(row)):
                if row[i]=='0':
                    arr[i] = 0
                else:
                    arr[i] += int(row[i])
            maxi = max(maxi,getMAH(arr))
        return maxi
def getMAH(arr):
    left = get_nearest_smaller_to_left(arr)
    right = get_nearest_smaller_to_right(arr)
    maxi = 0
    for i in range(len(arr)):
        area = (right[i] - left[i] - 1) * arr[i]
        maxi = max(maxi,area)
    return maxi
def get_nearest_smaller_to_left(arr):
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

def get_nearest_smaller_to_right(arr):
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
