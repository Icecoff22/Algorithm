str = input()

row = int(str[1])
col = int(ord(str[0]))-int(ord('a'))+1

ax = [-2, -2, -1, -1, 1, 1, 2, 2]
ay = [1, -1, 2, -2, 2, -2, 1, -1]
# steps = [(-2, -1), (-1, -2)...]
# for step in steps:
# next_row = row + step[0]
# next_col = col = step[1]
# 리스트 안에 튜플로 넣어서 c++의 pair과 비슷한 느낌으로 사용 가능
count = 0
for i in range(len(ax)):
    dx = col + ax[i]
    dy = row + ay[i]
    if dx>0 and dx<9 and dy>0 and dy<9:
        count+=1
print(count)