N, M = map(int, input().split())
if N<3 or M>50:
    print('bad input')
# N = 세로, M = 가로
A, B, d = map(int, input().split())

checked = [[0]*M for _ in range(N)]
arr = []
for i in range(N):
    arr.append(list(map(int, input().split())))

dx = [-1, 0, 1, 0]#북 동 남 서
dy = [0, 1, 0, -1]

def turn_left():
    global d
    d -=1
    if d==-1:
        d=3

checked[A][B] = 1
count=1
turn_time = 0
nx = A
ny = B
while True:
    turn_left()
    nx = nx + dx[d]
    ny = ny + dy[d]
    
    if nx>=N or nx<0 or ny>=M or ny<0 or checked[nx][ny]==1 or arr[nx][ny]==1:#바다거나 방문했거나 배열을 벗어난 경우
        nx = nx - dx[d]
        ny = ny - dy[d]
        turn_time+=1
        if turn_time==4:
            break
    else:
        print(nx, ny)
        checked[nx][ny]=1
        count+=1
        turn_time=0


print(count)
