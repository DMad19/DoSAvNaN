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
ll = SingleLinkedList()
print(ll.insert(100,0))
ll.displayLinkedList()
print(ll.insertLast(4))
ll.displayLinkedList()
print(ll.insert(300,1))
ll.displayLinkedList()
print(ll.insertFirst(3))
print(ll.insert(200,3))
print(ll.insert(200,0))
print(ll.insert(200,1))
ll.displayLinkedList()
