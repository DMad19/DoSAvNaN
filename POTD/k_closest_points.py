# https://www.geeksforgeeks.org/batch/gfg-160-problems/track/heap-gfg-160/problem/k-closest-points-to-origin--172242
# POTD 18-02-2025
import heapq
class Solution:
    def kClosest(self, points, k):
        # Your code here
        distances = []
        for point in points:
            dist = getDistance(point)
            if len(distances)<k:
                heapq.heappush(distances,(-dist,point))
            else:
                if -dist>distances[0][0]:
                    heapq.heappop(distances)
                    heapq.heappush(distances,(-dist,point))
        return [distance[1] for distance in distances]
            
        
def getDistance(point):
    distance = ((point[0]**2)+(point[1]**2))**0.5
    return abs(distance)