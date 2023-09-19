from collections import deque

N, M = map(int, input().split())

def bfs(x, y):
    queue = deque()
    queue.append((x,y))
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            ax = x+dx[i]
            ay = y+dy[i]
            if ax<0 or ay<0 or ax>=N or ay>=M:
                continue
            if arr[ax][ay]==0:
                continue
            if arr[ax][ay]==1:
                arr[ax][ay]= arr[x][y]+1
                queue.append((ax, ay))
    return arr[N-1][M-1]

arr = []
for _ in range(N):
    arr.append(list(map(int, input())))
dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

print(bfs(0, 0))

