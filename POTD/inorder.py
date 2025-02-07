# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/inorder-traversal
# POTD 07-02-2025

# Node Class:
class Node:
    def init(self,val):
        self.data = val
        self.left = None
        self.right = None

class Solution:
    def inOrder(self,root):
        # code here
        if(not root):
            return []
        l = []
        l.extend(self.inOrder(root.left))
        l.append(root.data)
        l.extend(self.inOrder(root.right))
        return l