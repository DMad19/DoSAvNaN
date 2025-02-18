class Queue:
    def __init__(self,size=10):
        self.l = [0]*size
        self.size = size
        self.ptr = 0
    
    def add(self,element):
        if(self.isFull()):
            raise Exception("Queue is Full")
        print("added")
        self.l[self.ptr] = element
        self.ptr += 1
        return True

    def remove(self):
        if(self.isEmpty()):
            raise Exception("Queue is Empty")
        removed = self.l[0]
        for i in range(1,self.ptr):
            self.l[i-1] = self.l[i]
        self.ptr -= 1
        return removed

    def front(self):
        if(self.isEmpty()):
            raise Exception("Queue is Empty")
        return self.l[self.ptr-1]

    def isFull(self):
        if(self.ptr==self.size):
            return True
        return False
    
    def isEmpty(self):
        if(self.ptr==0):
            return True
        return False
