class Solution:
    def trap(self, height):
        left = []
        maxi = 0
        for i in range(len(height)):
            if height[i]>=maxi:
                left.append(0)
                maxi = height[i]
            else:
                left.append(maxi)
        right = []
        maxi = 0
        for i in range(len(height)-1,-1,-1):
            if height[i]>=maxi:
                right.append(0)
                maxi = height[i]
            else:
                right.append(maxi)
        right = right[::-1]
        ans = 0
        for i in range(len(height)):
            ans += max(min(left[i],right[i])-height[i],0)
        return ans