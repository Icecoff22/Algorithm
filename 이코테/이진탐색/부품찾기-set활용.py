n = int(input())
arr = set(map(int, input().split()))

m = int(input())
visitor = list(map(int, input().split()))

for i in visitor:
    if i in arr:
        print('yes', end=' ')
    else:
        print('no',end=' ')