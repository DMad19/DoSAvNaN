# https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
# POTD 04-02-2025

# DForce
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

class Solution:
    def diameter(self, root):
        # Your code here
        return self.getdiameter(root)[1]-1
    def getdiameter(self,root):
        if(not root):
            return [0,0]
        left,c1 = self.getdiameter(root.left)
        right,c2 = self.getdiameter(root.right)
        c = 1 + left + right
        c = max(c1,max(c2,c))
        return [max(left+1,right+1),c]
        