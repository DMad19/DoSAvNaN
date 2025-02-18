class CircularQueue:
    def __init__(self,size=10):
        self.l = [0]*size
        self.size = 0
        self.f = 0
        self.e = 0
    
    def add(self,element):
        if(self.isFull()):
            raise Exception("Queue is Full")
        print("added")
        self.e  = self.e % len(self.l)
        self.l[self.e] = element
        self.e += 1
        self.size += 1
        return True

    def remove(self):
        if(self.isEmpty()):
            raise Exception("Queue is Empty")
        removed = self.l[self.f]
        self.f += 1
        self.f = self.f % len(self.l)
        self.size -= 1
        return removed

    def front(self):
        if(self.isEmpty()):
            raise Exception("Queue is Empty")
        return self.l[self.f]

    def isFull(self):
        if(self.size==len(self.l)):
            return True
        return False
    
    def isEmpty(self):
        if(self.size==0):
            return True
        return False

    def display(self):
        print("Circular Queue:")
        print(self.f,self.e,self.size)
        for i in range(self.f,self.f + self.size):
            print(self.l[i%len(self.l)])

