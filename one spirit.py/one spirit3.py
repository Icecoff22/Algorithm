string = 'ABC/-ADF/++'
arr = list(map(str, string))
tmp = []
for i in range(len(arr)):
    if ord(arr[i]) >= ord('A') and ord(arr[i]) <= ord('Z'):
        tmp.append(arr[i])
    else:
        a2 = tmp.pop()
        a1 = tmp.pop()
        res = '(' + a1 + arr[i] + a2 + ')'
        tmp.append(res)
print(tmp[0])


#후위표기식에서 중위표기식으로!

# 입력 : ABC/-ADF/++
# 출력 : (A-(B/C)) + (A+(D/F))