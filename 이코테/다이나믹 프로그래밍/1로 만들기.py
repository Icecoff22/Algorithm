x = int(input())
arr = [0] * (x+1)

for i in range(1, x+1):
    arr[i] = arr[i-1]+1
    if arr[i]%5==0:
        arr[i] = min(arr[i], arr[i//5]+1)
    if arr[i]%3==0:
        arr[i]  = min(arr[i], arr[i//3]+1)
    if arr[i]%2==0:
        arr[i] = min(arr[i], arr[i//2]+1)

print(arr[x]-1)
