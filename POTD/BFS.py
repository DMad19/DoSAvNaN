# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/level-order-traversal
# POTD 02-02-2025

class Node:
    def __init__(self, value):
        self.left = None
        self.data = value
        self.right = None

class Solution:
    def levelOrder(self, root):
        # Your code here
        l = []
        self.getBFS(root,l,0)
        return l
    def getBFS(self,root,l,level):
        if not root:
            return
        
        if len(l)<level+1:
            l.append([])
        
        l[level].append(root.data)
        
        self.getBFS(root.left,l,level+1)
        self.getBFS(root.right,l,level+1)