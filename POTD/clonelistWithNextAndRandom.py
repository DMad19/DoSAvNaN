# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/clone-a-linked-list-with-next-and-random-pointer

class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None
        self.random=None

# with hashmap
def cloneLinkedList(self, head):
    # code here
    d = {}
    cur = head
    while(cur):
        d[cur] = Node(cur.data)
        cur = cur.next
    cur = head
    while(cur):
        if cur.next:
            d[cur].next = d[cur.next]
        if cur.random:
            d[cur].random = d[cur.random]
        cur = cur.next
    return d[head]

# Using Interweaving
def cloneLinkedList(self, head):
    # code here
    cur = head
    while(cur):
        temp = Node(cur.data)
        temp.next = cur.next
        cur.next = temp
        cur = temp.next
    cur = head
    while(cur):
        if cur.random:
            cur.next.random = cur.random.next
        cur = cur.next.next
    cur = head
    clonedHead = head.next
    temp = clonedHead
    while(temp.next):
        cur.next = cur.next.next
        temp.next = temp.next.next
        cur = cur.next
        temp = temp.next
    cur.next = None
    temp.next = None
    return clonedHead