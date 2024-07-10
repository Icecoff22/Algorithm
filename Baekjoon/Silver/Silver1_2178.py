import sys
from collections import deque
input = sys.stdin.readline

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]

n, m = map(int, input().split())

arr = []

for i in range(n):
    arr.append(list(map(int, input().rstrip())))

q = deque([(0, 0)])

while q:
    x, y = q.popleft()
    for i in range(4):
        ax, ay = x + dx[i], y + dy[i]
        if 0 <= ax < n and 0 <= ay < m:
            if arr[ax][ay] == 1:
                q.append((ax, ay))
                arr[ax][ay] = arr[x][y] + 1

print(arr[n-1][m-1])




    

