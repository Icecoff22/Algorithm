arr = [['b', 'p', 'd'],
       ['d', 'q', 'b'],
       ['q', 'd', 'p'],
       ['p', 'b', 'q']]

a, b = map(int, input().split())
for i in range(a):
    arr2 = list(map(str, input().rstrip()))

    for j in range(len(arr2)):
        if arr2[j] == 'b':
            arr2[j] = arr[0][b]
        elif arr2[j] == 'd':
            arr2[j] = arr[1][b]
        elif arr2[j] == 'q':
            arr2[j] = arr[2][b]
        elif arr2[j] == 'p':
            arr2[j] = arr[3][b]
    print(''.join(arr2))