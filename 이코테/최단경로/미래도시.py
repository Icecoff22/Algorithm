import sys
import heapq
input = sys.stdin.readline
INF = int(1e9)
n, m = map(int, input().split())
graph = [[] for i in range(n+1)]
distance = [INF] * (n+1)
for i in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
def dijkstra(start):
    q = []
    heapq.heappush(q, start)
    distance[start] = 0
    
    while q:
        now = heapq.heappop(q)
        for i in graph[now]:
            if 1 < 



dijkstra(1)