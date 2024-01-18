n = list(input())
n_mid_idx = len(n)//2
cond = True
if len(n)%2==0:#문자열길이가 짝수일경우
    n_mid_idx_left=n_mid_idx-1
    for i in range(0,n_mid_idx):
        if n[n_mid_idx_left-i]!=n[n_mid_idx+i]:
            cond = False
            break
else:
    for i in range(0,n_mid_idx):
        if n[n_mid_idx-i]!=n[n_mid_idx+i]:
            cond = False
            break
if cond:
    print(1)
else:
    print(0)
        
