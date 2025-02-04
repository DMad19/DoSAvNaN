import sys
sys.path.append('D:\DoSA\DoSA_vNAN\pythonFiles\LinkedList')

from singleLinkedList import SingleLinkedList

ll = SingleLinkedList()
ll.insertRecursively(None, 0, 2000)
ll.displayLinkedList()
print(ll.insert(100, 0))
print(ll.insertLast(4))
ll.displayLinkedList()
ll.insertRecursively(None, 1, 1000)
ll.displayLinkedList()
ll.insertRecursively(None, 4, 43)
ll.displayLinkedList()