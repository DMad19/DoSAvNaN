# https://leetcode.com/problems/happy-number/
# pattern slow and fast pointer
class Solution:
    def isHappy(self, n: int) -> bool:
        slow = n
        fast = n
        while(fast!=1 and getSquareSum(fast)!=1):
            slow = getSquareSum(slow)
            fast = getSquareSum(getSquareSum(fast))
            if(slow==fast):
                return False
        return True
def getSquareSum(n):
    s = 0
    while(n):
        digit = n%10
        s += digit**2
        n = n//10
    return s