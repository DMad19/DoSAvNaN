class DoublyLinkedList:
    class Node:
        def __init__(self,data=None,prev=None,next=None):
            self._data = data
            self._prev = prev
            self._next = next
    def __init__(self):
        self._head = None
        self._tail = None
        self._size = 0
    def insertFirst(self,value):
        node = self.Node(value)
        if self._head == None:
            self._head = node
            self._tail = self._head
        else:
            node._next = self._head
            self._head._prev = node
            node._prev = None
            self._head = node
        self._size += 1
        return self._size
    def insertLast(self,value):
        if self._head == None:
            return self.insertFirst(value)
        node = self.Node(value)
        self._tail._next = node
        node._prev = self._tail
        self._tail = node
        self._size += 1
        return self._size
    def insert(self,index,value):
        if(index==0):
            return self.insertFirst(value)
        if(index==self._size):
            return self.insertLast(value)
        prev = self.find(index-1)
        node = self.Node(value)
        node._next = prev._next
        prev._next = node
        node._prev = prev
        node._next._prev = node
        self._size += 1
        return self._size
    def find(self,index):
        node = self._head
        for i in range(index):
            node = node._next
        return node
    def displayLinkedList(self):
        node = self._head
        while(node):
            print(str(node._data)+"->",end="")
            node = node._next
        print("None")
    def displayReverse(self):
        node = self._tail
        while(node):
            print(str(node._data)+"->",end="")
            node = node._prev
        print("None")
dll = DoublyLinkedList()
print(dll.insertLast(0))
print(dll.insert(0,100))
dll.displayLinkedList()
print(dll.insertFirst(1))
print(dll.insert(1,1000))
dll.displayLinkedList()
print(dll.insert(3,3000))
dll.displayLinkedList()
print(dll.insertFirst(2))
dll.displayLinkedList()
dll.displayReverse()