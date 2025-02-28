# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/stack-gfg-160/problem/evaluation-of-postfix-expression1735
# POTD 28-02-2025

import math
def is_integer(i):
    print("here")
    try:
        if int(i):
            return True
    except ValueError:
        return False
class Solution:
    def evaluate(self, arr):
        # code here
        # print(arr)
        stack = []
        for i in arr:
            print(stack)
            if is_integer(i):
                stack.append(int(i))
            else:
                a = stack.pop()
                b = stack.pop()
                if i == '+':
                    stack.append(b+a)
                elif i == '-':
                    stack.append(b-a)
                elif i == '*':
                    stack.append(b*a)
                elif i == '/':
                    ans = b/a
                    if(ans<0):
                        ans = int(math.ceil(ans))
                    else:
                        ans = int(math.floor(ans))
                    stack.append(ans)
        return stack[-1]