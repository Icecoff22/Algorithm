a,b = map(int, input().split())
c = True

for i in range(2,b):
    if a%i==0:
        print('BAD', i)
        c=False
        break
if c==True:
    print('GOOD')
            