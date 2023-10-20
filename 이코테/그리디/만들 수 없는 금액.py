n = int(input())
arr = list(map(int, input().rstrip()))
arr.sort()
target = 1
for i in arr:
    if i > target:
        break
    target+=i
    
print(target)