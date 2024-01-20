import sys
input = sys.stdin.readline

arr = [0]*10001
N = int(input())
for i in range(N):
    x = int(input())
    arr[x]+=1
for i in range(len(arr)):
    if arr[i]!=0:
        for j in range(arr[i]):
            print(i)