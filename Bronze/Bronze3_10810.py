n, m = map(int, input().split())
arr = [0 for _ in range(n+1)]
for i in range(m):
    a, b, c = map(int, input().split())
    for j in range(a,b+1):
        arr[j] = c

for i in range(1,n+1):
    print(arr[i], end=' ')