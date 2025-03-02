# https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1#expected-approach-using-deque-on-time-and-ok-space
# POTD 02-03-2025

import heapq
class Solution:
    def maxOfSubarrays(self, arr, k):
        # code here
        l = []
        res = []
        for i in range(k):
            heapq.heappush(l,(-arr[i],i))
        res.append(-l[0][0])
        for i in range(k,len(arr)):
            heapq.heappush(l,(-arr[i],i))
            
            while(l[0][1]<=i-k):
                heapq.heappop(l)
                
            res.append(-l[0][0])
        return res