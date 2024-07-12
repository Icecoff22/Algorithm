import sys
input = sys.stdin.readline

n = int(input())
arr = [[0, 0, 0]]
value = [0] * (n+1)
for i in range(1, n+1):
    arr.append(int(input())) # (계단의 점수, 올라간 총 점수, 연속된 계단 수)

if len(arr)==2:
    print(arr[1])

elif len(arr)==3:
    print(arr[1] + arr[2])

else:
    value[1] = arr[1]
    value[2] = arr[2] + arr[1]

    for i in range(3, n+1):
        value[i] = max(value[i-2] + arr[i], value[i-3] + arr[i-1] + arr[i])

    print(value[n])