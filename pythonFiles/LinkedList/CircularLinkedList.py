class CircularLinkedList:
    class Node:
        def __init__(self,data):
            self._data = data
            self._next = None
    def __init__(self):
        self._head = None
        self._tail = None
        self._size = 0
    def insert(self,value):
        node = self.Node(value)
        if self._head==None:
            self._head = node
        else:
            self._tail._next = node
        self._tail = node
        node._next = self._head
        self._size += 1
        return self._size
    def display(self):
        if(self._head!=None):
            temp = self._head
            print(str(temp._data)+"->",end="")
            temp = temp._next
            while(temp!=self._head):
                print(str(temp._data)+"->",end="")
                temp = temp._next
            print("HEAD")
        else:
            print("None")
    def delete(self,value):
        node = self.find(value)
        if(node==None):
            return self._size
        prev = self._head
        while(prev._next!=node):
            prev = prev._next
        if(prev==node):
            self._head = None
            self._tail = None
        else:
            prev._next = node._next
            if(node==self._head):
                self._head = prev._next
            elif(node==self._tail):
                self._tail = prev
        self._size += 1
        return self._size
    def find(self,value):
        node = self._head
        if(node!=None):
            if(node._data == value):
                return node
            node = node._next
            while(node!=self._head):
                if(node._data == value):
                    return node
                node = node._next
        return None   
cll = CircularLinkedList()
cll.display()
cll.insert(1)
cll.display()
cll.delete(1)
cll.display()
cll.insert(2)
cll.display()
cll.insert(3)
cll.delete(3)
cll.display()
cll.insert(3)
cll.insert(4)
cll.display()
cll.delete(3)
cll.display()