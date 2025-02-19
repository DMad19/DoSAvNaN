from circular_queue import CircularQueue

class DynCircularQueue(CircularQueue):
    def __init__(self, *args):
        super().__init__(*args)

    def add(self,element):
        if(self.isFull()):
            temp = [0]*len(self.l)*2
            for i in range(self.f,self.f+self.size):
                temp[i] = self.l[(self.f+i)%len(self.l)]
            self.l = temp
            self.f = 0
            self.e = self.size
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
        print("Dynamic Circular Queue:")
        print(self.f,self.e,self.size)
        for i in range(self.f,self.f + self.size):
            print(self.l[i%len(self.l)],"->",end="")
        print("")
    

