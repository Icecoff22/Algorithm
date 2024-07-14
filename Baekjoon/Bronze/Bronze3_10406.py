a, b, c = map(int, input().split())

cnt = 0
arr = list(map(int, input().split()))

for punch in arr:
    if a <= punch <= b:
        cnt += 1

print(cnt)