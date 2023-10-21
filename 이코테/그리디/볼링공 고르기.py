n, m = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort()
k = arr[0]
j=1
cnt=0
for i in range(1,n):
    if k!=arr[i]:
        k=arr[i]
        cnt+= (n-i)*j
        j=1
    else:
        j+=1
print(cnt)

"""
n,m = map(int, input().split())
arr = list(map(int, input().split()))
    
d = [0] * 11
for i in arr:
    d[i] += 1
    
res = 0
for i in range(1, m+1):
    n -= d[i]
    res += d[i]*n
"""