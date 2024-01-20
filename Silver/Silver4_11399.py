N = int(input())
arr = list(map(int, input().split()))

arr.sort()
res = 0
for i in range(N):
    res += arr.pop() * (i+1)
print(res)