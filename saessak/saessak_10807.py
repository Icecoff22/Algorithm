a = int(input())
arr = list(map(int, input().split()))
k = int(input())

cnt = 0
for i in range(len(arr)):
    if arr[i] == k:
        cnt+=1
print(cnt)