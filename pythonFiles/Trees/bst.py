from node import Node
class BST:
    def __init__(self):
        self.root = None
    def insert(self,value):        
        if self.root == None:
            self.root = Node(value)
            return self.root
        else:
            return self.insert1(self.root,value)
    def insert1(self,node,value):
        if node==None:            
            return Node(value)
        if value<node.value:
            node.left = self.insert1(node.left,value)
        else:
            node.right = self.insert1(node.right,value)
        return node
    def inorder(self):
        arr = []
        if(self.root):
            arr.extend(self.inorder1(self.root.left))
            arr.extend([self.root.value])
            arr.extend(self.inorder1(self.root.right))
        return arr
    def inorder1(self,node):
        if(node==None):
            return []
        arr= []
        arr.extend(self.inorder1(node.left))
        arr.extend([node.value])
        arr.extend(self.inorder1(node.right))
        return arr
    
    def display(self):
        if self.root:
            self.display1(self.root,"")
        else:
            print("Tree is Empty")
    def display1(self,node,indent):
        if node is None:
            return 
        else:
            print(indent + str(node.value))
            self.display1(node.left,indent+"\t")
            self.display1(node.right,indent+"\t")