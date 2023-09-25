n = int(input())
arr = [0]*100001

for i in input().split():
    arr[int(i)]=1
    
m = int(input())
visitor = list(map(int, input().split()))

for i in visitor:
    if arr[i]==1:
        print('yes', end=' ')
    else:
        print('no', end=' ')