N = int(input())
arr = []
for i in range(N):
    tmp = input()
    cond=0
    for i in arr:
        if i[0].find(tmp)!=-1:
            cond=1
            break
    if cond==1:
        continue
    arr.append((tmp,len(tmp)))

arr.sort(key=lambda x: x[1])
for i in range(1,arr[len(arr)-1][1]+1):
    