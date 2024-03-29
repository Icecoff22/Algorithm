import sys
input = sys.stdin.readline

def dfs(k):
    if len(arr) == m:
        print(" ".join(map(str, arr)))
        return
    for i in range(k, n+1):
        arr.append(i)
        dfs(i)
        arr.pop()

n, m = map(int, input().split())

arr = []
dfs(1)