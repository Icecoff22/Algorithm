N, M = map(int, input().split())

arr = [list(map(int, input())) for _ in range(N)]
count=0
dx = [-1, 0, 1, 0]#북 서 남 동
dy = [0, -1, 0, 1]

def bfs(x, y):
    arr[x][y]=1
    global dx, dy
    
    for i in range(4):
        ax = x + dx[i]
        ay = y + dy[i]
        if ax<0 or ax >=N or ay<0 or ay>=M or arr[ax][ay]==1:
            print("continue:", ax, ay)
            continue
        print("bfs:", ax, ay)
        bfs(ax, ay)
    
print(arr)
for i in range(N):
    for j in range(M):
        if arr[i][j]==0:
            print(i, j)
            count+=1
            bfs(i, j)
print(count)


    