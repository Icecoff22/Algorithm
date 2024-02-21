def dfs():
    if len(res)==m:
        print(" ".join(map(str, res)))
        return
    for i in range(1,n+1):
        if (len(res)>0 and res[-1]>= i) or visited[i]==True:
            continue
        res.append(i)
        visited[i] = True
        dfs()
        res.pop()
        visited[i] = False

n, m = map(int, input().split())
res = []
visited = [False]*(n+1)
dfs()