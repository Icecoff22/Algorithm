def fibo(x):
    if x==1 or x==2:
        return 1
    return fibo(x-1) + fibo(x-2)

for i in range(1, 10):
    print(fibo(i), end=" ")