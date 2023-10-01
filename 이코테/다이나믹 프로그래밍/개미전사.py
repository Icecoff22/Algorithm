N = int(input())
arr = list(map(int, input().split()))

tmp = [0] * 101
tmp[1] = arr[0]
tmp[2] = arr[1] if arr[1]>arr[0] else arr[0]

for i in range(3, N+1):
    tmp[i] = max(tmp[i-1], tmp[i-2]+arr[i-1])
print(tmp[N])