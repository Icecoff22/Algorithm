INF = int(1e9)

n = int(input())
m = int(input())

graph = [[INF]*(n+1) for i in range(n+1)]

for i in range(n+1):
    graph[i][i] = 0
    
for i in range(m):
    a,b,c = map(int, input())
    graph[a][b] = c

for k in range(n+1):
    for a in range(n+1):
        for b in range(n+1):
            graph[a][b] = min(graph[a][b], graph[a][k]+graph[k][b])
            