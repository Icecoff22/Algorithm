T = int(input())

for _ in range(T):
    n, m = map(int, input().split())
    arr = [[0]*(m+1) for _ in range(n+1)]
    for i in range(n+1):
        for j in range(m+1):
            if i==0:
                continue
            elif i==1:
                arr[1][j]=j
            else:
                sum = 0
                for k in range(j):
                    sum+=arr[i-1][k]
                arr[i][j] = sum
    print(arr[n][m])
                    
        
        
    