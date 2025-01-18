# https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
def reverseList(self, head):
    # Code here
    prev = None
    curr = head
    nextN = curr.next
    while(nextN!=None):
        prev = curr
        curr = nextN
        nextN = nextN.next
        curr.next = prev
    head.next = None
    return curr