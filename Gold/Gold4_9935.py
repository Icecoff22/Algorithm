import sys
input = sys.stdin.readline

s = input().rstrip()
boom = input().rstrip()
len_boom = len(boom)
len_s = len(s)
arr = []
for i in range(len_s):
    arr.append(s[i])
    if ''.join(arr[-len_boom:])==boom:
        for i in range(len_boom):
            arr.pop()
        
if ''.join(arr)=='':
    print('FRULA')
else:
    print(''.join(arr))