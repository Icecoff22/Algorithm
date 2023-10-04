n, m = map(int, input().split())
arr = []
res = [10001] * (m+1)

for i in range(n):
    tmp = int(input())
    arr.append(tmp)
res[0] = 0
for i in range(n):
    for j in range(arr[i], m+1):
        if res[j-arr[i]]!=10001:
            res[j] = min(res[j], res[j-arr[i]]+1)
    
if res[m]==10001:
    print(-1)
else:
    print(res[m])

