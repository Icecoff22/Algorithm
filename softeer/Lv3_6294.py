import sys
input = sys.stdin.readline

N, K = map(int, input().split())
arr = list(map(int, input().split()))
for i in range(K):
    A, B = map(int, input().split())
    print("{:.2f}".format(sum(arr[A-1:B])/(B-A+1)))
    