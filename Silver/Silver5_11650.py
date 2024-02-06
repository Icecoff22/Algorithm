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

# 범위가 [-100,000, 100,000] 이므로 나눠서 오름차순 정렬.
# def get_pos(nums):
#     i, j = nums.split()
#     return int(i) + int(j)/1000000

# def get_answer():
#     nums_list = sys.stdin.readlines()[1:]
#     nums_list.sort(key=lambda nums: get_pos(nums))
#     sys.stdout.write("".join(nums_list))

# get_answer()