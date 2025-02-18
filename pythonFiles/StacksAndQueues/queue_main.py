from queue import Queue
from circular_queue import CircularQueue
queue = CircularQueue(5)

queue.add(1)
queue.add(2)
queue.add(3)
print(queue.remove())
print(queue.display())
print(queue.front())
queue.add(4)
queue.add(5)
queue.add(6)
queue.display()
print("Removed:")
print(queue.remove())
print(queue.remove())
print(queue.remove())
queue.display()