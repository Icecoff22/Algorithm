arr = [[0]*100 for _ in range(100)]
t = int(input())
res = 0
for i in range(t):
    x, y = map(int, input().split())
    for j in range(x,x+10):
        for k in range(y,y+10):
            arr[j][k] = 1

for i in range(100):
    for j in range(100):
        if arr[i][j]==1:
            res+=1
print(res)