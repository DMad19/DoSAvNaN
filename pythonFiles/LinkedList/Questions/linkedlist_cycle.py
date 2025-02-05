# https://leetcode.com/problems/linked-list-cycle/description/
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle1(self, head):
        s = set()
        node = head
        while(node):
            if node in s:
                return True
            s.add(node)
            node = node.next
        return False
    def hasCycle2(self, head):
        slow = head
        fast = head
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow==fast):
                return True
        return False
    def cycleLength(self,head):
        slow = head
        fast = head
        while(fast and fast.next):
            slow = slow.next
            fast = fast.next.next
            if(slow==fast):
                slow = slow.next
                len = 1
                while(slow!=fast):
                    slow = slow.next
                    len += 1
                return len
        return 0