class SingleLinkedList:
    class Node:
        def __init__(self,data,next=None):
            self._data = data
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
            self._head = node
        self._size+=1
        return self._size
    def insertLast(self,value):
        if self._head ==None:
            return self.insertFirst(value)
        node = self.Node(value)
        self._tail._next = node
        self._tail = node
        self._size+=1
        return self._size
    def insert(self,value,index):
        if index<0 or index>self._size:
            raise Exception("invalid index")
        if index==0:
            return self.insertFirst(value)
        elif index==self._size:
            return self.insertLast(value)
        temp = self._head
        # i = 1
        # while(i<index):
        #     temp = temp._next
        #     i+=1
        # nextNode = temp._next
        # newNode = self.Node(value)
        # temp._next = newNode
        # newNode._next = nextNode
        for i in range(1,index):
            temp = temp._next
        temp._next = self.Node(value,temp._next)
        self._size+=1
        return self._size
    def displayLinkedList(self):
        temp = self._head
        while(temp):
            print(str(temp._data)+"->",end="")
            temp = temp._next
        print("None")
    def deleteFirst(self):
        if self._head==None:
            return self._size
        self._head = self._head._next
        if(self._head==None):
            self._tail = None
        self._size -= 1
        return self._size
    def deleteLast(self):
        if self._size == 0:
            return self._size
        if self._head==self._tail:
            return self.deleteFirst()
        # temp = self._head
        # while(temp._next._next):
        #     temp = temp._next
        temp = self._get(self._size - 2)
        temp._next = None
        self._tail = temp
        self._size -= 1
        return self._size
    def delete(self,index):
        if self._size == 0:
            return self._size
        if index==0:
            return self.deleteFirst()
        if index==self._size-1:
            return self.deleteLast()
        node = self._get(index)
        node._next = node._next._next
        self._size -= 1
        return self._size
    def _get(self,index):
        temp = self._head
        for i in range(index):
            temp = temp._next
        return temp
    def getNodeValue(self,value):
        node = self._head
        while(node):
            if node._next == value:
                return node
            node = node._next
        return None
ll = SingleLinkedList()
print(ll.insert(100,0))
print(ll.insertLast(4))
print(ll.delete(1))
ll.displayLinkedList()
print(ll.insertFirst(5))
ll.displayLinkedList()
print(ll.deleteLast())
ll.displayLinkedList()
print(ll.deleteFirst())
ll.displayLinkedList()
print(ll.delete(0))