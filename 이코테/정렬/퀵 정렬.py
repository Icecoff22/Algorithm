arr = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]

def quick_sort(arr, start, end):
    if start>=end:
        return
    pivot = start
    left = start+1
    right = end
    while left<=right:
        while left<=end and arr[left]<=arr[pivot]:
            left+=1
        while right>=start and arr[right]>=arr[pivot]:
            right-=1
        if left>right:
            arr[pivot], arr[right] = arr[right], arr[pivot]
        else:
            arr[left], arr[right] = arr[right], arr[left]
    quick_sort(arr, start, right-1)
    quick_sort(arr, right+1, end)

quick_sort(arr, 0, len(arr)-1)
print(arr)


# 퀵정렬은 불안정 정렬, 다른 원소와의 비교로 정렬을 수행하는 비교 정렬
# 분할 정복 알고리즘의 하나, merge sort와 달리 리스트를 비균등하게 분할
