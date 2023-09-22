N = int(input())

arr = []

for i in range(N):
    x, y = input().split()
    arr.append((x,y))

res = sorted(arr, key=lambda data:data[1])
for i in res:
    print(i[0], end=' ')