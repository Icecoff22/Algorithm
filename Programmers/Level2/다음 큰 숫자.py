def solution(n):
    answer = n
    while True:
        answer += 1
        if bin(n)[2:].count('1') == bin(answer)[2:].count('1'):
            break
    
    return answer
#기본적인 브루트 포스 문제였다.
#너무 어렵게 생각한 것이 패인.