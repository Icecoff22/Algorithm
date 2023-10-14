n, m = map(int, input().split())
maxCntOfDivisor = -1
maxCnt = -1
maxNum = -1
for i in range(n, m+1):
    k = i
    cond = 2
    cnt=0
    cntOfDivisor = 1
    while k != 1:
        chk = 1
        while k % cond == 0:
            k /= cond
            cnt+=1
            chk+=1
        cntOfDivisor = cntOfDivisor * chk
        cond+=1
    if cntOfDivisor > maxCntOfDivisor:
        maxCntOfDivisor = cntOfDivisor
        maxNum = i
        maxCnt = cnt
        
        

print(maxNum, maxCntOfDivisor, maxCnt)