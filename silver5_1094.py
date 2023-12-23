import heapq
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
    