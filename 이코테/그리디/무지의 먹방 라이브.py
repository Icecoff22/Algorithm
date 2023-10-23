import heapq

def solution(food_times, k):
    if sum(food_times)<=k:
        return -1
    
    q = []
    for i in range(len(food_times)):
        heapq.heappush(q,(food_times[i],i+1))
    
    sum_time = 0
    previous_time = 0
    length = len(food_times)
    
    while(sum_time + (q[0][0]-previous_time)*length <=k):
        now_time = heapq.heappop(q)[0]
        sum_time += (now_time-previous_time)*length
        length-=1
        previous_time = now_time
    
    res = sorted(q,key = lambda x:x[1])
    
    return res[(k-sum_time)%length][1]

food_times = [8,6,4]
k=15

print(solution(food_times,k))