
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

class Solution:
    # Return the kth smallest element in the given BST 
    def kthSmallest(self, root, k): 
        #code here.
        return getKthSmallest(root,[0],k)

def getKthSmallest(root,count,k):
    if not root:
        return -1
    
    left = getKthSmallest(root.left,count,k)
    
    if left!=-1:
        return left
        
    count[0] += 1
    
    if count[0] == k:
        return root.data
        
    return getKthSmallest(root.right,count,k)