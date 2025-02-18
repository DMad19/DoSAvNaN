from stack import Stack
class DynamicStack(Stack):
    def __init__(self,size=10):
        super().__init__(size)
    
    def push(self,element):
        if(super().isFull()):
            self.size = self.size * 2
            temp = [0] * self.size
            for i in range(len(self.l)):
                temp[i] = self.l[i]
            self.l = temp
        super().push(element)