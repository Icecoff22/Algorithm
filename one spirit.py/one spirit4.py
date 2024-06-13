import random
import matplotlib.pyplot as plt

def monty_hall_simulation(num_simulations):
    change_wins = 0  # 선택을 바꾸어서 당첨된 횟수
    stay_wins = 0    # 선택을 바꾸지 않고 당첨된 횟수

    for _ in range(num_simulations):
        doors = [0, 0, 1]  # 세 개의 문 중 하나에는 상품이 있음, 1은 상품을 나타냄
        random.shuffle(doors)  # 문의 위치를 무작위로 섞음

        # 참가자가 처음에 선택한 문
        initial_choice = random.randint(0, 2)

        # 선택을 바꾸지 않았을 때와 바꾸었을 때의 결과 확인
        
        stay_result = doors[initial_choice]

        # 선택을 바꾸지 않고 당첨된 경우
        if stay_result == 1:
            stay_wins += 1
        else:
            change_wins += 1
            
    stay_probability = stay_wins / num_simulations
    change_probability = change_wins / num_simulations

    return stay_probability, change_probability

num_simulations = 10000000  # 시뮬레이션 횟수 설정
stay_prob, change_prob = monty_hall_simulation(num_simulations)
print(stay_prob, change_prob) # 결과가 매번 달라짐..?

# 결과 시각화
labels = ['Stay', 'Change']
probabilities = [stay_prob, change_prob]

plt.bar(labels, probabilities, color=['blue', 'orange'])
plt.xlabel('Strategy')
plt.ylabel('Probability of Winning')
plt.title('Monty Hall Problem Simulation Results (100 Trials)')
plt.ylim(0, 1)
plt.show()