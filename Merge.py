def MergeSort(l, low, high):
    if low < high:
        mid = (low + high) // 2
        MergeSort(l, low, mid)
        MergeSort(l, mid + 1, high)
        Merge(l, low, mid, high)

def Merge(l, low, mid, high):
    temp = []
    left = low
    right = mid + 1
    while left <= mid and right <= high:
        if l[left] <= l[right]:
            temp.append(l[left])
            left += 1
        else:
            temp.append(l[right])
            right += 1
    while left <= mid:
        temp.append(l[left])
        left += 1
    while right <= high:
        temp.append(l[right])
        right += 1
    for i in range(low, high + 1):
        l[i] = temp[i - low]

def main():
    print("Enter values")
    l = list(map(int, input().split()))
    low = 0
    high = len(l) - 1
    MergeSort(l, low, high)
    print("Sorted list:", l)

if __name__ == "__main__":
    main()
