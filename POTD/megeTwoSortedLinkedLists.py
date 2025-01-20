# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/merge-two-sorted-linked-lists

# Optimal
class Node:
    def __init__(self, data):   # data -> value stored in node
        self.data = data
        self.next = None

def sortedMerge(self,head1, head2):
    # code here
    head = Node(0)
    temp = head
    while(head1 and head2):
        if(head1.data<head2.data):
            temp.next = head1
            temp = temp.next
            head1 = head1.next
        else:
            temp.next = head2
            temp = temp.next
            head2 = head2.next
    if(head1):
        temp.next = head1
        temp = temp.next
        head1 = head1.next
    if(head2):
        temp.next = head2
        temp = temp.next
        head2 = head2.next
    return head.next