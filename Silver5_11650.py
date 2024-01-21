N = int(input())
arr = []
for i in range(N):
    [a, b] = (map(int, input().split()))
    arr.append([a, b])

arr.sort()

for i in arr:
    print(i[0], i[1])
    
# 두번째 값 기준 오름차순, 같을 경우 첫번째 값 오름차순
# arr.sort(key=lambda x: (x[1], x[0]))

# 두번째 값 기준 내림차순, 같을 경우 첫번째 값 오름차순
# arr.sort(key=lambda x: (-x[1], x[0]))

# 두번째 값 기준 내림차순
# arr.sort(key=lambda x: x[1])

# 시간 줄이는 코드
# import sys
# input = sys.stdin.readline
# N = int(input())
# arr = []
# for i in range(N):
#   a, b = map(int, input().split())
#   arr.append([a, b])
# arr.sort()
# for i in arr:
#   print(i[0], i[1])      