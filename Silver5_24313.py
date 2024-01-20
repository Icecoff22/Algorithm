a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())

fn0 = a1*n0+a0
gn0 = c*n0

if fn0>gn0:
    print(0)
else:
    if a0 <= (c-a1)*100:
        print(1)
    else:
        print(0)