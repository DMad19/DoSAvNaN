# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/detect-loop-in-linked-list


class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None

def detectLoop(head):
        #code here
        slow = head
        fast = head
        while(slow and fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if slow==fast:
                return True
        return False