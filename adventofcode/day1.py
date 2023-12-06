import re

result = 0

while True:
    a = input()
    if a == '':
        break
    
    b = list(re.sub(r'[^0-9]', '', a))
    round_result = int(b[0]+b[len(b)-1])
    result += round_result
    
print(result)