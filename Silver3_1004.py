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
    
#간략한 풀이과정
#출발점, 도착점에 대해 출발점과 각원의 중심과의 거리, 반지름을 활용하여 
#거리가 반지름보다 작으면 해당 원 안에 있는 것, 아니면 그 밖에 있는 것
#이것을 이용하여 출발점, 도착점을 각각 감싸고 있는 원의 개수를 구한다.
#만약 출발점과 도착점을 동시에 감싸고 있는 원이면 
#내부에서 길을 찾을 수 있기 때문에 제외한다.