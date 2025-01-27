class Node:
    def __init__(self,key,value):
        self.key = key
        self.value = value
        self.next = None
        self.prev = None

class LRUCache:
    #Constructor for initializing the cache capacity with the given value.  
    def __init__(self, cap):
        #code here
        self.cap = cap
        self.cache = {}
        self.head = Node(-1,-1)
        self.tail = Node(-1,-1)
        self.head.next = self.tail
        self.tail.prev = self.head
    
    def _add(self,node):
        next_node = self.head.next
        self.head.next = node
        node.next = next_node
        node.prev = self.head
        next_node.prev = node
        
    def _remove(self,node):
        next_node = node.next
        prev_node = node.prev
        prev_node.next = next_node
        next_node.prev = prev_node
        
    #Function to return value corresponding to the key.
    def get(self, key):
        #code here
        if key not in self.cache:
            return -1
        node = self.cache[key]
        self._remove(node)
        self._add(node)
        return node.value
        
    #Function for storing key-value pair.   
    def put(self, key, value):
        #code here
        if key in self.cache:
            node = self.cache[key]
            self._remove(node)
            del self.cache[key]
        
        if len(self.cache)>=self.cap:
            lru_node = self.tail.prev
            self._remove(lru_node)
            del self.cache[lru_node.key]
        new_node = Node(key,value)
        self.cache[key] = new_node
        self._add(new_node)