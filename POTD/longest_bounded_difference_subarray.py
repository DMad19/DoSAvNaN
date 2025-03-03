# https://www.geeksforgeeks.org/problems/longest-bounded-difference-subarray/1
# POTD 03-03-2025

from collections import deque
class Solution:
    def longestSubarray(self, arr, x):
        start = 0 
        end = 0
        minqueue = deque()
        maxqueue = deque()
        begin = 0
        maxLen = 1
        while(end<len(arr)):
            while(minqueue and arr[minqueue[-1]]>arr[end]):
                minqueue.pop()
            while(maxqueue and arr[maxqueue[-1]]<arr[end]):
                maxqueue.pop()
            minqueue.append(end)
            maxqueue.append(end)
            while(arr[maxqueue[0]] - arr[minqueue[0]] > x):
                if start == minqueue[0]:
                    minqueue.popleft()
                if start == maxqueue[0]:
                    maxqueue.popleft()
                start += 1
            if end - start > maxLen - 1:
                begin = start
                maxLen = end - start + 1
            end += 1
        return arr[begin:begin + maxLen]