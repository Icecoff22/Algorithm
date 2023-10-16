n = int(input())
arr = list(map(int, input().split()))
arr.sort()
cnt=0
i=0
while True:
    k = arr[i]
    i+=k-1
    if i>=len(arr) or arr[i]>k:
        break
    cnt+=1
    i+=1
    
print(cnt)
