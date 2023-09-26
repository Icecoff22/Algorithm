N, M = map(int, input().split())
arr = list(map(int, input().split()))

start = 0
end = max(arr)

target = 0
while (start<end):
    res = 0
    mid = (start+end)//2
    for i in arr:
        if i>mid:
            res += i - mid
    if res<M:
        end = mid - 1
    else:
        target = mid
        start = mid+1
print(target)