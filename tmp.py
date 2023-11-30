def solution(friends, gifts):

    arr = [[0]*len(friends) for _ in range(len(friends))]# 친구 사이의 선물 주고받은 배열 2차원
    arr_exp = [0 for _ in range(len(friends))]# 각 사람당 선물 지수
    will_gift_arr = [0 for _ in range(len(friends))]
    for gift in gifts:
        giver, receiver = gift.split()
        
        arr[friends.index(giver)][friends.index(receiver)]+=1
        arr_exp[friends.index(giver)]+=1
        arr_exp[friends.index(receiver)]-=1
    for i in range(len(friends)):
        print(arr[i])
    print(arr_exp)
    for i in range(len(friends)-1):
        for j in range(i+1,len(friends)):
            if arr[i][j]>arr[j][i]:#준 사람의 선물의 개수가 더 많은 경우
                will_gift_arr[i]+=1
            elif arr[i][j]<arr[j][i]:#받은 사람의 선물의 개수가 더 많은 경우
                will_gift_arr[j]+=1
            else:#주고받은 사람의 선물의 개수가 같은 경우
                if arr_exp[i]>arr_exp[j]:
                    will_gift_arr[i]+=1
                elif arr_exp[i]<arr_exp[j]:
                    will_gift_arr[j]+=1
    print(will_gift_arr)
    answer = max(will_gift_arr)

    return answer


friends = ['muzi','ryan','frodo','neo']
gifts=['muzi frodo','muzi frodo','ryan muzi','ryan muzi','ryan muzi', 'frodo muzi','frodo ryan', 'neo muzi']

friends2 = ['','b','c']
gifts2=['a b','b a','c a','a c','a c','c a']
print(solution(friends,gifts))