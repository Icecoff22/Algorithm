N, M = map(int, input().split())
arr = list(map(int, input().split()))

start = 0
end = max(arr) #절단기의 최저,최고점 초기화

while start<end:
    length = 0
    mid = (start+end)//2
    for i in arr:
        if mid<i:
            length += i - mid
    if length<M:
        end = mid - 1
    elif length>M:
        res = mid
        start = mid +1
    else:
        res = mid
        start = mid +1
print(res)