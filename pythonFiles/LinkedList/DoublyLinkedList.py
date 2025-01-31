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
print(dll.insertFirst(1))
print(dll.insertFirst(2))
print(dll.insertFirst(3))
print(dll.insertFirst(4))
dll.displayLinkedList()
dll.displayReverse()