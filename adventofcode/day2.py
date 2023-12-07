import re
cond = ['red', 12, 'green', 13, 'blue', 14]
sum=0
while True:
    a = input()
    round_cond=0
    if a=='':
        break
    b = list(a.split())
    for i in range(2, len(b)):
        if i%2==0:
            if b[i+1].find('red')!=-1 and int(b[i])>cond[1]:

                round_cond=1
                break
            elif b[i+1].find('green')!=-1 and int(b[i])>cond[3]:

                round_cond=1
                break
            elif b[i+1].find('blue')!=-1 and int(b[i])>cond[5]:

                round_cond=1
                break
        else:
            continue
    if round_cond==0:
        b[1] = (re.sub(r'[^0-9]','',b[1]))
        sum+=int(b[1])
        print(b[1],":",sum)
print(sum)

#2시간 가량 걸렸다.
#이유 및 포인트 : 정규표현식의 사용, 숫자는 0부터 9까지이다. 1부터 9까지가 아니다.