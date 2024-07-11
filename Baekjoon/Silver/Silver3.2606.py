import sys
from collections import deque
input = sys.stdin.readline




n = int(input())
edge = int(input())
visited = [False] * (n+1)

arr = [[] for i in range(n+1)]

for i in range(edge):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)
visited[1] = 1
q = deque([1])

cnt = 0

while q:
    _to = q.popleft()
    cnt+=1

    for i in arr[_to]:
        if not visited[i]:
            q.append(i)
            visited[i]=True

print(cnt-1)