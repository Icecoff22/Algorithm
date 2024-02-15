import sys
input = sys.stdin.readline

def merge_sort(A, p, r):
    if p < r :
        q = (p+r)//2
        merge_sort(A, p, q)
        merge_sort(A, q+1, r)
        merge(A, p, q, r)

def merge(A, p, q, r):
    global cnt, k, res, tmp
    i = p
    j = q+1
    t = 0
    while i <= q and j <= r:
        if A[i] <= A[j]:
            tmp[t] = A[i]
            t, i = t+1, i+1
        else:
            tmp[t] = A[j]
            t, j = t+1, j+1
    while i <= q:
        tmp[t] = A[i]
        t, i = t+1, i+1
    while j <= r:
        tmp[t] = A[j]
        t, j = t+1, j+1
    i, t = p, 0
    while i <= r:
        cnt+=1
        A[i] = tmp[t]
        if cnt == k:
            res = A[i]
        i, t = i+1, t+1

cnt = 0
res = -1
n, k = map(int, input().split())
tmp = [-1 for i in range(n)]

arr = list(map(int, input().split()))
merge_sort(arr, 0, len(arr)-1)
print(res)