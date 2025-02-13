class Node:

	# Constructor to initialize the node object
	def __init__(self, data):
		self.data = data
		self.next = None

class Solution:
    def rearrange(self, head):
        # Code here
        # step 1 - traverse alternatively and make connections
        first = head
        second = head.next
        seconddup = second
        while(second and second.next):
            first.next = first.next.next
            first = first.next
            second.next = second.next.next
            second = second.next
        prev = None
        while(seconddup):
            first.next = seconddup
            nextN = seconddup.next
            seconddup.next = prev
            prev = seconddup
            seconddup = nextN
        return head