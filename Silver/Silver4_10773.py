from collections import deque
import sys

input = sys.stdin.readline

K = int(input())
q = deque()
for i in range(K):
    n = int(input())
    if n == 0:
        q.pop()
    else:
        q.append(n)
res = 0
for i in q:
    res + res + i
print(res)