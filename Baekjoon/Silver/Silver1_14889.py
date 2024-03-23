N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]
visited = [False] * N
target = N//2
res=999999
def dfs(x,k):
    global _min, res
    if k==target: 
        a, b =0, 0
        for i in range(N):
            for j in range(N):
                if visited[i] and visited[j]:
                    a+=arr[i][j]
                if not visited[i] and not visited[j]:
                    b+=arr[i][j]
        res = min(res,abs(a-b))
        return
    for i in range(x, N):
        if not visited[i]:
            visited[i]=True
            dfs(i+1,k+1)
            visited[i]=False

dfs(0, 0)
print(res)