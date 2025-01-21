# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/reverse-a-linked-list-in-groups-of-given-size

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Optimal - DForce
def reverseKGroup(head, k):
    prev = None
    cur = head
    first = head
    nextFirst = None
    flag = True
    i = 0
    while(i<k and cur!=None):
        next = cur.next
        cur.next = prev
        if nextFirst:
            first.next = cur
        prev = cur
        cur = next
        i+=1
        i = i%k
        if(i==0 or cur==None):
            if flag:
                head = prev
            if nextFirst:
                first = nextFirst
            nextFirst = cur
            flag = False
    first.next = cur
    return head