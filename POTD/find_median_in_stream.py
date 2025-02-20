# brute force
class Solution:
    def getMedian(self, arr):
        newarr = []
        ans = []
        for i in arr:
            newarr.append(i)
            newarr.sort()
            if len(newarr)%2:
                ans.append(newarr[len(newarr)//2])
            else:
                length = len(newarr)
                ans.append((newarr[length//2]+newarr[(length//2)-1])/2)
        return ans