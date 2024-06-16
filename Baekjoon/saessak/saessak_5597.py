checked = [False] * 31

for i in range(28):
    checked[int(input())] = True
for i in range(1,31):
    if not checked[i]:
        print(i)