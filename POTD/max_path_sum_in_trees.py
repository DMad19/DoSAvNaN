
class Node:
    def __init__(self,val):
        self.data = val
        self.left = None
        self.right = None

class Solution:
    #Function to return maximum path sum from any node in a tree.
    def findMaxSum(self, root): 
        #Your code here
        res = [root.data]
        maxPathSumUtil(root,res)
        return res[0]
def maxPathSumUtil(root,res):
    if not root:
        return 0
    l = max(0,maxPathSumUtil(root.left,res))
    r = max(0,maxPathSumUtil(root.right,res))
    res[0] = max(res[0],l+r+root.data)
    return root.data + max(l,r)