N, L = map(int, input().split())

res = -1

for i in range(L,101):
    x = 0.5*(2*N/i - i+1)
    if x.is_integer():
        res = [k for k in range(int(x),int(x+i))]
        if -1 in res:
            res = -1
            continue
        break

if res==-1:
    print(-1)
else:
    for i in res:
        print(i,end=' ')

#풀이 : 등차수열의 합
# S(n) = n(2a + (n-1)d)/2 (n은 항의 개수, a는 초항, d는 등차)
# 여기서 수는 연속되므로 등차는 1이고,  S(n) = N, n = L이므로
# N = L(2a + L-1)/2
# 2N = L(2a + L-1)
# a = (2N-L^2+L)/(2*L)
# 여기서 a가 정수이면 조건에 부합하므로 이를 활용해 해결한다.