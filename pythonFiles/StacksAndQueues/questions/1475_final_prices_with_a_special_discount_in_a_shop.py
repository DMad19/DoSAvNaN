# 1475. Final Prices With a Special Discount in a Shop
# https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
class Solution:
    def finalPrices(self, prices):
        ans = []
        stack = []
        for i in range(len(prices)-1,-1,-1):
            while(len(stack)>0 and stack[-1]>prices[i]):
                stack.pop()
            if stack:
                ans.append(prices[i]-stack[-1])
            else:
                ans.append(prices[i])
            stack.append(prices[i])
        return ans[::-1]
