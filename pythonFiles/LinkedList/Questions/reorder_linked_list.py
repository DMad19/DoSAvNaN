# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reorderList(self, head):
        """
        Do not return anything, modify head in-place instead.
        """
        if not head or not head.next:
            return
        mid = getMid(head)
        secondhead = reverse(mid)
        while(head and secondhead):
            firstheadNext = head.next
            secondheadNext = secondhead.next
            head.next = secondhead
            if firstheadNext:
                secondhead.next = firstheadNext
            head = firstheadNext
            secondhead = secondheadNext
        

def getMid(head):
    slow = head
    fast = head
    prev = None
    while(fast and fast.next):
        prev = slow
        slow = slow.next
        fast = fast.next.next
    if prev:
        prev.next = None
    return slow

def reverse(head):
    prev = None
    cur = head
    while(cur):
        nextN = cur.next
        cur.next = prev
        prev = cur
        cur = nextN
    return prev
