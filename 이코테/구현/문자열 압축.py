def solution(s):
    result = []
    
    for i in range(1, (len(s)//2)+1):
        b=''
        tmp = s[:i]
        cnt = 1
        
        for j in range(i,len(s),i):
            if tmp==s[j:j+i]:
                cnt+=1
            else:
                if cnt==1:
                    b = b + tmp
                else:
                    b = b + str(cnt) + tmp
        if cnt==1:
            b = b + tmp
        else:
            b = b + str(cnt) + tmp
        result.append(b)

    return min(result)