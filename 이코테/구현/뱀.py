from collections import deque

def checkCrashWall(x,y,N):
    if x>=N or x<0 or y>=N or y<0:
        return True
    return False

def checkCrashSnake(x,y,snakeInfo):
    for i in snakeInfo:
        if snakeInfo[i][0]==x and snakeInfo[i][1]==y:
            return True
    return False

N = int(input())
k = int(input())
snakeInfo = deque()
snakeInfo.append((0,0))
arr = [[0]*N for i in range(N)]
move = [(0,1),(1,0),(-1,0),(0,-1)]#동남서북
move_dir = 0
for i in range(k):
    a,b = map(int, input().split())
    arr[a][b] = 1

l = int(input())
for i in range(l):
    a, b = input().split()
    int_a = int(a)
    for j in range(int_a):
        x, y = move[move_dir]
        