S = list(input().rstrip())

string = []
number = []
for i in range(len(S)):
    if ord(S[i])>47 and ord(S[i])<58 :
        number.append(int(S[i]))
    else:
        string.append(S[i])
string.sort()
string.append(str(sum(number)))
print(''.join(string))
