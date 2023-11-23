def solution(s):

    min_len = len(s)

    for unit in range(1, (len(s)//2)+1):
        result = ""    
        previous = s[0:unit]
        count = 1
        for idx in range(unit, len(s), unit):
            now = s[idx:idx+unit]
            if (now == previous):
                count += 1
            else:
                if (count >= 2):
                    result += str(count) + previous
                else:
                    result += previous
                previous = now
                count = 1
        if (count >= 2):
            result += str(count) + previous
        else:
            result += previous    
        min_len = min(min_len, len(result))

    return min_len