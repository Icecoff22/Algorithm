import heapq
import sys
input = sys.stdin.readline
INF = 1e9
n, m = map(int, input().split())
start = int(input())

arr = [[] for i in range(n+1)]
for i in range(n+1):
    a, b, c = map(int, input().split())
    arr[a].append((b,c))
distance = [INF]*(n+1)

def dijkstra(start):
    q = []
    distance[start] = 0
    heapq.heappush(q, (start, 0))
    
    while q:
        now, dist = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in arr[now]:
            cost = i[1] + dist
            if cost < distance[i[0]]:
                cost = distance[i[0]]
                heapq.heappush(q, (i[0], cost))
            
    
    
dijkstra(start)
print(distance)