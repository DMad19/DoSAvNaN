from queue import Queue
from circular_queue import CircularQueue
from dynamic_circular_queue import DynCircularQueue
queue = DynCircularQueue(5)

queue.add(1)
queue.add(2)
queue.add(3)
queue.add(4)
queue.add(5)
queue.add(6)
queue.display()
print(queue.remove())
queue.display()
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