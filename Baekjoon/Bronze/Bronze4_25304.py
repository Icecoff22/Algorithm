import sys
input = sys.stdin.readline

X = int(input())
N = int(input())
res = 0
for i in range(N):
    price, cnt = map(int, input().split())
    res += price*cnt
if X == res:
    print('Yes')
else:
    print('No')