# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/construct-tree-1
# POTD 06-02-2024

# Node class
class Node:
    def __init__(self,val):
        self.data = val
        self.right = None
        self.left = None

# Note: Build tree and return root node
class Solution:
    def buildTree(self, inorder, preorder):
        # code here
        return buildRecursively(inorder,preorder,[0],0,len(preorder)-1)

def search(inorder,value,left,right):
    for i in range(left,right+1):
        if inorder[i] == value:
            return i
    return -1
def buildRecursively(inorder,preorder,index,left,right):
    if left>right:
        return None
    root = Node(preorder[index[0]])
    inorder_index = search(inorder,preorder[index[0]],left,right)
    index[0] += 1
    root.left = buildRecursively(inorder,preorder,index,left,inorder_index-1)
    root.right = buildRecursively(inorder,preorder,index,inorder_index+1,right)
    return root