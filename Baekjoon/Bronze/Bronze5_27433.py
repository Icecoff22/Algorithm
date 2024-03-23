import sys
input = sys.stdin.readline

n = int(input())

def factorial(k):
    if k > 1:
        return factorial(k-1) * k
    else:
        return 1
print(factorial(n))