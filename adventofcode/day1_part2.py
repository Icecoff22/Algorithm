def check(chk, i):
    global minidx, maxidx, min_num, max_num
    if minidx>=chk:
        minidx = chk
        min_num = number_num[i]
    if maxidx<=chk:
        maxidx = chk
        max_num = number_num[i]


alpha_num = ['one','two','three','four','five','six','seven','eight','nine']
number_num = ['1','2','3','4','5','6','7','8','9']
sum = 0
while True:
    min_num = '0'
    max_num = '0'
    minidx = 999999
    maxidx = 0
    a = input()
    if a=='':
        break
    for i in range(9):
        tmp = a.find(number_num[i])
        tmp2 = a.rfind(number_num[i])
        tmp3 = a.find(alpha_num[i])
        tmp4 = a.rfind(alpha_num[i])
        if tmp!=-1:
            check(tmp, i)
        if tmp2!=-1:
            check(tmp2, i)
        if tmp3!=-1:
            check(tmp3, i)
        if tmp4!=-1:
            check(tmp4, i)
    print(int(min_num+max_num))
    sum += int(min_num+max_num)
print(sum)