# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/dynamic-programming-gfg-160/problem/longest-increasing-subsequence-1587115620#using-recursion-exponential-time-and-linear-space
# POTD 04-03-2025

class Solution:
    def lis(self, arr):
        # code here
        l = getAllSubSequences([],arr)
        maxi = 1
        for i in l:
            maxi = max(len(i),maxi)
        return maxi
    
def getAllSubSequences(p,arr):
    if len(arr)==0:
        for i in range(len(p)-1):
            if p[i]<p[i+1]:
                continue
            else:
                return []
        return [p]
    l = []
    dup = p.copy()
    dup.append(arr[0])
    l.extend(getAllSubSequences(dup,arr[1:]))
    l.extend(getAllSubSequences(p[:],arr[1:]))
    return l