import sys
def is_promising(x):
    for i in range(x):
        if arr[i] == arr[x] or abs(x-i)==abs(arr[x]-arr[i]):
            return False
    return True

def n_queen(x):
    global ans
    if x==n:
        ans+=1
        return
    for i in range(n):
        if visited[i] == False:
            arr[x] = i
            if is_promising(x):
                visited[i]==True
                n_queen(x+1)
                visited[i]==False

n = int(sys.stdin.readline())
ans = 0
arr = [0] * n
visited = [False] * n


n_queen(0)
print(ans)