# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/k-largest-elements4206
# POTD 17-02-2025
class Solution:
    def kLargest(self, arr, k):
        # Your code here
        arr.sort(reverse=True)
        return arr[:k]