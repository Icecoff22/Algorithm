import re
ans=0
while True:
    ok=True
    a = input()
    if a=='':
        break
    id_, line = a.split(':')
    for event in line.split(';'):
        for balls in event.split(','):
            n,color = balls.split()
            if int(n) > {'red' : 12, 'green' : 13, 'blue' : 14}.get(color,0):
                ok = False
    if ok:
        ans +=int(id_.split()[-1])
        print(int(id_.split()[-1]),":",ans)
        print(id_)
print(ans)