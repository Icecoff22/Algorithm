import math
T = int(input())
for t in range(T):
    x1, y1, x2, y2 = map(int, input().split())#출발점(x1,y1), 도착점(x2,y2)
    n = int(input())
    res = 0
    for _ in range(n):
        cx,cy,r = map(int,input().split())
        start_dis = math.sqrt(pow(abs(x1-cx),2) + pow(abs(y1-cy),2))
        end_dis = math.sqrt(pow(abs(x2-cx),2) + pow(abs(y2-cy),2))
        if start_dis < r and end_dis < r:
            continue
        elif start_dis < r or end_dis < r:
            res+=1
    print(res)