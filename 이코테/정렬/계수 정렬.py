array = [7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2]

count = [0] * (max(array) +1)

for i in range(len(array)):
    count[array[i]] +=1

for i in range(len(count)):
    for j in range(count[i]):
        print(i, end=' ')
        
res = sorted(array)
print(res)


# key 값대로 정렬
# sorted(정렬할 리스트, 정렬방식(함수로))
# 아래 예시에서 setting함수에 의해 어느 key값으로 정렬할지 선택
# 아래 예시에서 한글 순서대로 정렬하려면 data[0]을, 숫자 순서대로 정렬하려면 data[1]을 리턴해야함.
# 내림차순으로 하려면 sorted(정렬할 리스트, key=정렬대상, reverse=True/False)
array2 = [('바나나', 2), ('사과', 5), ('당근', 3)]

def setting(data):
    return data[0]

res2 = sorted(array2, key=setting)
print(res2)
