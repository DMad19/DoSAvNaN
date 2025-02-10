# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/k-sum-paths
# POTD - 10-02-2025


# Basic
class Solution1:
    def sumK(self,root,k):
        # code here
        if not root:
            return 0
        res = countPaths(root,k,0)
        res += self.sumK(root.left,k)
        res += self.sumK(root.right,k)
        return res
    
def countPaths(root,k,curSum):
    if not root:
        return 0
    
    count = 0
    curSum += root.data
    
    if curSum == k:
        count += 1
    
    count += countPaths(root.left,k,curSum)
    count += countPaths(root.right,k,curSum)
    
    return count

# optimised
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

class Solution:
    def sumK(self,root,k):
        # code here
        if not root:
            return 0
        res = countPaths(root,k,0,{})
        return res
    
def countPaths(root,k,curSum,d):
    if not root:
        return 0
    
    count = 0
    curSum += root.data
    
    if curSum == k:
        count += 1
    
    count += d.get(curSum-k,0)
    
    d[curSum] = d.get(curSum,0) + 1
    
    count += countPaths(root.left,k,curSum,d)
    count += countPaths(root.right,k,curSum,d)
    
    d[curSum] -= 1
    
    return count