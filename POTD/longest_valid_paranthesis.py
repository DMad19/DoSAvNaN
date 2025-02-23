# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/longest-valid-parentheses5657
# POTD 22-02-2025

def maxLength(self, s):
    # code here
    stack = [-1]
    maxLen = 0
    for i in range(len(s)):
        if s[i]=="(":
            stack.append(i)
        else:
            stack.pop()
            if stack:
                maxLen = max(maxLen,i-stack[-1])
            else:
                stack.append(i)
    return maxLen