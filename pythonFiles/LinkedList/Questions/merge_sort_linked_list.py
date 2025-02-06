# https://leetcode.com/problems/sort-list/
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(not head or not head.next):
            return head
        mid = findMid(head)
        l1 = self.sortList(head)
        l2 = self.sortList(mid)
        return merge(l1,l2)
def merge(node1,node2):
    node = ListNode(0)
    temp = node
    while(node1 and node2):
        if(node1.val<node2.val):
            temp.next = node1
            node1 = node1.next
            temp = temp.next
        else:
            temp.next = node2
            node2 = node2.next
            temp = temp.next
    if(node1):
        temp.next = node1
    if(node2):
        temp.next = node2
    return node.next
def findMid(head):
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