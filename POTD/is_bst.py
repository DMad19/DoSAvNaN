# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/check-for-bst#approach-1-using-specified-range-of-min-and-max-values-on-time-and-oh-space
# POTD 11-02-2025

class Solution:
    
    #Function to check whether a Binary Tree is BST or not.
    def isBST(self, root):
        #code here
        return inorder(root,[float("-inf")])
        
def inorder(root,prev):
    if not root:
        return True
        
    if not inorder(root.left,prev):
        return False
    
    if prev[0]>=root.data:
        return False
    
    prev[0] = root.data
    
    return inorder(root.right,prev)