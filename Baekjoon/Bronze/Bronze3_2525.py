import sys
input = sys.stdin.readline

hour, minute = map(int, input().split())
plus_minute = int(input())

if plus_minute+minute>=60:
    div = (plus_minute+minute)//60
    rem = (plus_minute+minute)%60
    if hour+div>=24:
        print((hour+div)%24, rem)
    else:
        print(hour+div, rem)
else:
    print(hour, plus_minute+minute)