arr = []
check = []
start_idx = -1
sum = 0
while True:
    a = input()
    if a=='':
        break
    arr.append(a)
check = [[0]*len(arr[0]) for i in range(len(arr))]
for i in range(len(arr)):#기호 주변 반경에 드는 인덱스 0에서 1로 변환, *기호는 0에서 2로 변환
    for j in range(len(arr[i])):
        if arr[i][j]=='*':
            for k in range(i-1,i+2):
                for l in range(j-1,j+2):
                    if k<0 or l<0 or k>=len(arr) or l>=len(arr[0]):
                        continue
                    check[k][l] = 2
        elif not (arr[i][j].isdigit() or arr[i][j]=='.'):
            for k in range(i-1,i+2):
                for l in range(j-1,j+2):
                    if k<0 or l<0 or k>=len(arr) or l>=len(arr[0]):
                        continue
                    check[k][l] = 1
####
for i in range(len(check)):
    for j in range(len(check[i])):
        print(check[i][j],end=' ')
    print()
     
for i in range(len(arr)):
    for j in range(len(arr[i])):
        possible = False        
        if arr[i][j].isdigit() and start_idx==-1:
            start_idx=j
        elif not arr[i][j].isdigit() and start_idx!=-1:
            last_idx=j
            for k in range(start_idx,last_idx):
                if check[i][k]==1:
                    possible = True
                    break
            if possible:
                sum+=int(arr[i][start_idx:last_idx])
            start_idx=-1
        elif arr[i][j].isdigit() and j==len(arr[i])-1:
            last_idx=j+1
            for k in range(start_idx,last_idx):
                if check[i][k]==1:
                    possible = True
                    break
            if possible:
                sum+=int(arr[i][start_idx:last_idx])
            start_idx=-1

##for multiple '*'            
for i in range(len(arr)):
    for j in range(len(arr[i])):
        possible = False        
        if arr[i][j].isdigit() and start_idx==-1:
            start_idx=j
        elif not arr[i][j].isdigit() and start_idx!=-1:
            last_idx=j
            for k in range(start_idx,last_idx):
                if check[i][k]==2:
                    possible = True
                    break
            if possible:
                
                
                sum+=int(arr[i][start_idx:last_idx])
            start_idx=-1
        elif arr[i][j].isdigit() and j==len(arr[i])-1:
            last_idx=j+1
            for k in range(start_idx,last_idx):
                if check[i][k]==1:
                    possible = True
                    break
            if possible:
                sum+=int(arr[i][start_idx:last_idx])
            start_idx=-1         
            
print(sum)

            