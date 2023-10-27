n = list(map(int, input().rstrip()))

j = len(n)//2

left_sum = 0
right_sum = 0

for i in range(len(n)//2):
    left_sum += n[i]
    right_sum += n[i+j]

if left_sum == right_sum:
    print('LUCKY')
else:
    print('READY') 