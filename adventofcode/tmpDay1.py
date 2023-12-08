alpha_num = ['one','two','three','four','five','six','seven','eight','nine']
sum = 0
while True:
    a = input()
    if a=='':
        break
    digit = []
    for i,c in enumerate(a):
        if c.isdigit():
            digit.append(c)
        for d,val in enumerate(['one','two','three','four','five','six','seven','eight','nine']):
            if a[i:].startswith(val):
                digit.append(str(d+1))
    score = int(digit[0]+digit[-1])
    sum+=score
print(sum)