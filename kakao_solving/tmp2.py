from collections import deque

def checkNextRound(holding, target_number):
    
    for i in range(len(holding)):
        for j in range(i+1,len(holding)):
            if holding[i]+holding[j]==target_number:
                return True
    return False

def solution(coin, cards):
    answer = 0
    holding = deque()
    cond=1
    target_number = len(cards)+1
    idx = len(cards)//3
    willing_cards = [deque()]
    game_round=1
    for i in range(len(cards)//3):
        holding.append(cards[i])

    willing_cards[0].append((holding, coin, 0))
    tmp = holding
    tmp.append(cards[idx])
    willing_cards[0].append((tmp, coin-1, 0))
    tmp2 = holding
    print(tmp2)
    tmp2.append(cards[idx+1])
    tmp4 = tmp2
    willing_cards[0].append((tmp4,coin-1,0))
    tmp3 = holding
    print(tmp4)
    tmp3.extend(cards[idx::idx+2])
    willing_cards[0].append((tmp3,coin-2,0))
    for i in range(4):
        print(willing_cards[0][i])
    #print(willing_cards[0])
    for i in range(4):
        if coin==0 and checkNextRound(willing_cards[0][0][0], target_number)==False:
            return 1
        if coin<=1 and checkNextRound(willing_cards[0][1][0], target_number)==False and checkNextRound(willing_cards[0][2][0], target_number)==False:
            return 1
        if checkNextRound(willing_cards[0][3][0], target_number)==False:
            return 1
    
    while(cond):
        if idx>=len(cards):
            break
        
        willing_cards[game_round].append((holding, coin, game_round))
        willing_cards[game_round].append((holding.append(cards[idx]), coin-1, game_round))
        willing_cards[game_round].append((holding.append(cards[idx+1]),coin-1,game_round))
        willing_cards[game_round].append((holding.extend(cards[idx::idx+2]),coin-2,game_round))

        for i in range(4):
            if willing_cards[game_round][i][1]<0:
                willing_cards[game_round][i][2]=willing_cards[game_round-1][i][2]

        for i in range(4):
            if checkNextRound(willing_cards[game_round][i][0], target_number)==False:
                break

    #현재 보유하고 있는 카드와 뽑은 카드 두 장 중 한장을 더한 값이 목표 값이거나, 두장 모두 더한 값이 목표 값일 때
    #동전을 소모해서 산다.

    


    return answer

cards=[3,6,7,2,1,10,5,9,8,12,11,4]
coin=4
print(solution(coin,cards))