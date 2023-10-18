s = list(map(int, input().rstrip()))
cnt0=0
cnt1=0

for i in range(1, len(s)):
    if s[i]==1 and s[i-1]==0:
        cnt1+=1
    elif s[i]==0 and s[i-1]==1:
        cnt0+=1
print(min(cnt1,cnt0))
        