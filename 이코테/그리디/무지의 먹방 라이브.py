import heapq

def solution(food_times, k):

    q = []
    for i in range(len(food_times)):
        heapq.heappush(q,(food_times[i],i+1))
    previous = 0
    food_num = len(food_times)
    
    while q:
        t = (q[0][0] - previous) * food_num
        if k>=t:
            k-=t
            previous, _ = heapq.heappop(q)
            food_num-=1
        else:
            idx = k%food_num
            q.sort(key=lambda x:x[1])
            return q[idx][1]
food_times=[3,1,2]
k=5
print(solution(food_times,k))
