n, m = map(int, input().split())
arr = list(map(int, input().split()))
pop_list = []
first_element = 1
res=0
for element in arr:
    front_pop_cnt = 0
    rear_pop_cnt = 0
    for pop_element in pop_list:
        if element > first_element and (pop_element > first_element and pop_element < element):
            front_pop_cnt+=1
        elif first_element > element and pop_element > first_element:
            front_pop_cnt+=1
        elif first_element > element and element > pop_element:
            front_pop_cnt+=1
        else:
            rear_pop_cnt+=1
    if element >= first_element:
        front = element - first_element
        rear = n-(element-first_element)
    else:
        front = n-(first_element-element)
        rear = first_element - element
    front -= front_pop_cnt
    rear -= rear_pop_cnt
    res += min(front,rear)
    pop_list.append(element)
    first_element = element+1
    while(first_element in pop_list):
        first_element+=1
print(res)

#간략한 풀이
#리스트에 뺄 숫자들을 입력받고 하나씩 접근하면서
# 앞으로 세었을 때랑 뒤로 세었을 때 비교한다.
# 뺀 숫자들을 pop_list로 두어 앞으로 세었을 때, 뒤로 세었을 때에서
# 각각 뺀 숫자들의 갯수를 빼준다.
# 그 중 더 작은 값을 더한다.

# 더 간략한 풀이
# 리스트를 새롭게 구성한다.
# ex) _list = _list[idx:] + _list[:idx]
# _list.pop(0)