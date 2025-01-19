# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/rotate-a-linked-list

# DForce
def rotate(head, k):
    # code here
    length = 1
    last = head
    while(last.next!=None):
        last = last.next
        length+=1
    i = 0
    temp = head
    while(i<k%length):
        last.next = temp
        last = last.next
        prev = temp
        temp = temp.next
        
        # make i Node's next as None
        prev.next = None
        i+=1
    return temp