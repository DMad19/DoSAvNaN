# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/height-of-binary-tree
# POTD 03-02-2025

class Solution:
    #Function to find the height of a binary tree.
    def height(self, root):
        # code here
        return self.getHeight(root)-1
    def getHeight(self,root):
        if(root==None):
            return 0
        c = 0
        left = 1 + self.getHeight(root.left)
        right = 1 + self.getHeight(root.right)
        if left>right:
            c += left
        else:
            c += right
        return c