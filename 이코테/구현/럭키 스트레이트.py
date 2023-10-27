n = input()

half = len(n)//2


left_sum = 0
right_sum = 0

for i in range(half):
    left_sum += int(n[i])
    right_sum += int(n[i+half])

if left_sum == right_sum:
    print('LUCKY')
else:
    print('READY') 