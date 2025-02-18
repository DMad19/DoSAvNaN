class Stack:

    def __init__(self,size=10):
        self.l = [0]*size
        self.size = size
        self.ptr = -1

    def push(self,element):
        if(self.isFull()):
            raise Exception("Stack is Full")
        self.ptr += 1
        self.l[self.ptr] = element
        return True

    def pop(self):
        if(self.isEmpty()):
            raise Exception("Stack is Empty")
        popped = self.l[self.ptr]
        self.ptr -= 1
        return popped

    def peek(self):
        if(self.isEmpty()):
            raise Exception("Stack is Empty")
        return self.l[self.ptr]

    def isFull(self):
        if(self.ptr==self.size-1):
            return True
        return False
    
    def isEmpty(self):
        if(self.ptr==-1):
            return True
        return False
