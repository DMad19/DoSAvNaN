
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None


class Solution:
    def findTarget(self, root, target): 
        # your code here.
        s = set()
        return checkTargetPair(root,target,s)
    
def checkTargetPair(root,target,s):
    if not root:
        return False
    
    if target-root.data in s:
        return True
    
    s.add(root.data)
    
    return checkTargetPair(root.left,target,s) or checkTargetPair(root.right,target,s)
        