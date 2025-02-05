# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/tree-gfg-160/problem/mirror-tree
# POTD 05-02-2024

class Solution:
    #Function to convert a binary tree into its mirror tree.
    def mirror(self, root):
        # Code here
        if(not root):
            return None
        left = self.mirror(root.left)
        right = self.mirror(root.right)
        root.left = right
        root.right = left
        return root