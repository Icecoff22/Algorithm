def solution(n):
    answer = 0
    arr = []
    
    for i in range(1, int(n**(1/2)) + 1):
        if (n % i == 0):
            arr.append(i) 
            if ( (i**2) != n) : 
                arr.append(n // i)
    for i in range(len(arr)):
        if arr[i]%2:
            answer += 1

    return answer