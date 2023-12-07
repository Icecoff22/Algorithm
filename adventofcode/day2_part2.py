red_num,green_num,blue_num = 0,0,0
color_dict = {'red': red_num, 'green': green_num, 'blue': blue_num}
sum=0
while True:
    res=1  
    a = input()
    if a=='':
        break
    _, line = a.split(':')
    for event in line.split(';'):
        for balls in event.split(','):
            n,color = balls.split()
            if int(n) > color_dict.get(color,0):
                color_dict[color] = int(n)
                
    keys = color_dict.keys()    
    for i in keys:
        res*=color_dict[i]
        color_dict[i]=0
    print(res)
    sum+=res

print(sum)
#짧은 소감 : 딕셔너리의 활용법을 어느정도 익힌 문제.