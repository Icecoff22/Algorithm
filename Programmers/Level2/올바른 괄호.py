from collections import deque
def solution(s):
    answer = True
    
    q = deque()
    for i in range(len(s)):
        if s[i]==')' and not q:
            return False
        elif s[i]==')':
            q.pop()
        else:
            q.append(s[i])
    if q:
        return False
    return True