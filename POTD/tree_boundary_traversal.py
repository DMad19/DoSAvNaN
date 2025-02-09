#User function Template for python3


class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

class Solution:
    def boundaryTraversal(self, root):
        # Code here
        l = []
        if root and root.left or root.right:
            l.append(root.data)
        l.extend(getLeftBoundaries(root.left))
        l.extend(getLeafNodes(root))
        l.extend(getRightBoundaries(root.right))
        return l
def getLeafNodes(root):
    if(root and not root.left and not root.right):
        return [root.data]
    l = []
    if root.left:
        l.extend(getLeafNodes(root.left))
    if root.right:
        l.extend(getLeafNodes(root.right))
    return l

def getLeftBoundaries(root):
    if(not root or (not root.left and not root.right)):
        return []
    l = []
    l.append(root.data)
    if root.left:
        l.extend(getLeftBoundaries(root.left))
    elif root.right:
        l.extend(getLeftBoundaries(root.right))
    return l

def getRightBoundaries(root):
    if(not root or (not root.left and not root.right)):
        return []
    l = []
    if root.right:
        l.extend(getRightBoundaries(root.right))
    elif root.left:
        l.extend(getRightBoundaries(root.left))
    l.append(root.data)
    return l
    