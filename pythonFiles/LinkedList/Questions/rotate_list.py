# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def rotateRight(self, head, k) :
        if not head or not head.next:
            return head
        length = getLength(head)
        k = k%length
        if k==0:
            return head
        k = length - k
        cur = head
        for i in range(1,k):
            cur = cur.next
        if cur:
            nextN = cur.next
            newHead = nextN
            cur.next = None
            while(nextN.next):
                nextN = nextN.next
            nextN.next = head
            head = newHead
        return head
def getLength(head):
    l = 0
    cur = head
    while(cur):
        cur = cur.next
        l += 1
    return l