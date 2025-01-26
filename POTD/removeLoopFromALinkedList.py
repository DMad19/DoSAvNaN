class Node:
    def __init__(self,val):
        self.next=None
        self.data=val

# DForce
def removeLoop(head):
    # code here
    slow = head 
    fast = head
    while(fast and fast.next):
        slow = slow.next
        fast = fast.next.next
        if slow==fast:
            slow = head
            while(slow!=fast):
                slow = slow.next
                fast = fast.next
            cur = slow              #Instead of cur we can use the already existing fast pointer
            while(cur.next!=slow):
                cur = cur.next
            cur.next = None
    return head