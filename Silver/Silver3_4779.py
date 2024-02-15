import sys
def func(a, n):
    global res
    if n==1:
        return
    for i in range(a + n//3, a + (n//3)*2):
        res[i]=' '
    func(a, n//3)
    func(a+n//3*2,n//3)

while True:
    try:
        N = int(sys.stdin.readline())
        res = ['-'] * pow(3,N)
        func(0, 3**N)
        print(''.join(res))
    except:
        break