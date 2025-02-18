from queue import Queue

queue = Queue(5)

queue.add(1)
queue.add(2)
queue.add(3)
print(queue.front())
queue.add(4)
queue.add(5)

print(queue.remove())
print(queue.remove())
print(queue.remove())
