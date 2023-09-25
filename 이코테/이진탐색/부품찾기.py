def binary_search(start, end, arr, target):
    if start>end:
        return None
    mid = (start+end)//2
    if arr[mid]==target:
        return mid
    elif arr[mid]>target:
        return binary_search(start,mid-1,arr,target)
    else:
        return binary_search(mid+1,end,arr,target)

N = int(input())
arr = list(map(int, input().split()))
M = int(input())
visitor = list(map(int, input().split()))

arr.sort()

for i in visitor:
    res = binary_search(0,N-1,arr,i)
    if res==None:
        print('no',end=' ')
    else:
        print('yes',end=' ')