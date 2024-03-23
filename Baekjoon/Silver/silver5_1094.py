'''import heapq
X = int(input())
sum = 64
q = []
heapq.heappush(q,sum)
while sum!=X:
    a = heapq.heappop(q)
    a = a // 2
    if sum-a>=X:
        sum-=a
        heapq.heappush(q,a)
    else:
        heapq.heappush(q,a)
        heapq.heappush(q,a)
print(len(q))
'''
#다른 풀이, 주어진 target값에서 2씩 나누면서 카운트
#주어진 값이 무조건 64보다 작으니 범위 걱정은 X
#다른 풀이

X = int(input())
cnt = 0
while X!=0:
    if X % 2 ==1:
       cnt+=1
    X = X // 2
print(cnt) 

    