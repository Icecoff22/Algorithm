def binary_search(start, end, arr, target):
    if start>=end:
        return None
    mid = (start+end)//2
    
    if arr[mid]==target:
        return mid
    
    if arr[mid]>target:
        binary_search(mid+1,n-1,arr,target)
    if arr[mid]<target:
        binary_search(0, mid-1,arr,target)
    
    
    

n, target = map(int, input().split())
arr = list(map(int, input().split()))

res = binary_search(0, n-1, arr, target)
if res==None:
    print('none')
else:
    print(res+1)
