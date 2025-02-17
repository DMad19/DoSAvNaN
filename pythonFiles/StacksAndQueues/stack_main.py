from stack import Stack;

stack = Stack(5)

stack.push(1)
stack.push(2)
stack.push(3)

print("peek element",stack.peek())

stack.push(4)
stack.push(5)

print(stack.pop())
print(stack.pop())
print(stack.pop())
print(stack.pop())
print(stack.pop())