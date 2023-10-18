

arr = list(map(int,input().rstrip()))

arr.sort(reverse=True)
sum = 1
for i in arr:
    if i<=1:
        sum+=i
    else:
        sum *= i
print(sum)