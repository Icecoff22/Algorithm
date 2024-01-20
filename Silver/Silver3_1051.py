import sys
n,m = map(int, input().split())
_list = []
for i in range(n):
    _list.append(list(map(int, sys.stdin.readline().rstrip())))
res = 1
for i in range(2,min(n,m)+1):
    for j in range(n+1-i):
        for k in range(m+1-i):
                if _list[j][k]==_list[j][k+i-1]==_list[j+i-1][k]==_list[j+i-1][k+i-1]:
                    res = i*i
print(res)