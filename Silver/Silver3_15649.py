import sys
input = sys.stdin.readline

def dfs():
    if len(arr)==m:
        print(' '.join(map(str,arr)))
        return
    for i in range(1,n+1):
        if visited[i]:
            continue
        visited[i] = True
        arr.append(i)
        dfs()
        arr.pop()
        visited[i] = False

n, m = map(int, input().split())
arr = []
visited = [False] * (n+1)
dfs()
'''
if len(arr)==m:
        print(' '.join(map(str,arr)))
        return
이부분을 원래는
if len(arr)==m:
    for i in range(len(arr)):
        print(arr[i],end=' ')
    print()
이렇게 했었다. 시간복잡도가 많이 느렸다. 따라서 join을 통해
배열을 한번에 출력하여 시간복잡도를 줄이자.        
        '''