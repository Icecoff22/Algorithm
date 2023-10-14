N, M = map(int, input().split())
arr = list(map(int, input().split()))

start = 0
end = max(arr) #절단기의 최저,최고점 초기화

while start<end:
    length = 0
    mid = (start+end)//2
    for i in arr:
        if mid<i:
            length += i - mid
    if length<M:
        end = mid - 1
    else : 
        res = mid
        start = mid +1
print(res)

# 키 포인트
# line 13에서 17부분
# length가 M보다 작을경우, 손님한테 줄 떡의 길이가 원하는 길이보다
# 작은 것이다. 이것은 절단한 길이가 커서 줄 떡이 줄어든 것이므로
# 절단 길이를 줄이기 위해 end값을 줄인다.
# length가 M과 같은 경우, 조건에는 부합하지만 절단 길이의 최댓값을
# 찾아야 하기 때문에 그때의 절단 길이 값을 저장하고 start값을 높인다.
# length가 M보다 큰 경우, 손님한테 줄 떡의 길이가 원하는 길이보다
# 큰 것이다. 이것은 절단한 길이가 작아서 손님한테 줄 떡이 커진 것이므로
# 우선 절단 값을 기억하고 start값을 높인다.
# 사실 length가 M보다 큰 경우엔 start값만 높이면 되는데,
# length가 M과 같은 경우에 최댓값을 찾기 위해 start값을 높여야 하는 로직이 존재하므로
# 위 코드에서는 else문을 사용하여 length>M과 length==M을 합쳤다.