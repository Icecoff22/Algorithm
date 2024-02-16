import sys
input = sys.stdin.readline

def recur(k, _from, other, _to):
    if k==0:
        return
    recur(k-1, _from, _to, other)
    print(_from, _to)
    recur(k-1, other, _from, _to)

k = int(input())
print(2**k-1)
recur(k, 1, 2, 3)