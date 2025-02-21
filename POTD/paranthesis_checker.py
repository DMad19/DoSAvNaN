# https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
class Solution:
    def isBalanced(self, s):
        # code here
        stack = []
        for i in s:
            if i=='{' or i=='[' or i=='(':
                stack.append(i)
            else:
                if not stack:
                    return False
                if(matched(stack[-1],i)):
                    stack.pop()
                else:
                    return False
        return not stack

def matched(top,i):
    if (top=='[' and i==']') or (top=='(' and i==')') or (top=='{' and i=='}') :
        return True
    return False