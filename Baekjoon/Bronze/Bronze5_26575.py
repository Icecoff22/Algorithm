T = int(input())

for i in range(T):
    arr = input().split()
    for j in range(3):
        if arr[j].startswith('.'):
            arr[j] = '0' + arr[j]
    
    print("${:.2f}".format(float(arr[0]) * float(arr[1]) * float(arr[2]), 2))