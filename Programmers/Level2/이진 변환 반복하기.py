def solution(s):
    answer = []
    zero_cnt = 0
    while_cnt = 0
    while(s.find('0')!=-1):
        while_cnt += 1
        arr = []
        for i in range(len(s)):
            if s[i]=='1':
                arr.append(s[i])
            else:
                zero_cnt += 1
        binary = bin(len(arr))
        s = binary[2:]
    return answer

solution('110010101001')