#메모이제이션 활용
arr = [0] * 100

def fibo(x):
    if x==1 or x==2:
        return 1
    if arr[x]!=0:
        return arr[x]
    arr[x] = fibo(x-1) + fibo(x-2)
    return arr[x]

print(fibo(99))