"""
TIM SORT

time complexity => 
Best case => O(n)
Average case => O(n log(n))
Worst case => O(n log n)

Tim sort is a hybrid of insertion sort and merge sort 
which are themselves some of the best sorting
algorithms

It is efficient for sorting large data sets and 
is the most used algorithm in real life

Fact : Python and Java provide a sort function
This sort function by default in tim sort
"""

MIN_MERGE = 32

# Returns minimum number of runs
def calcMinRun(n):
    r = 0
    while n >= MIN_MERGE:
        r |= n & 1
        n >>= 1
    return n + r


# This function sorts array from left index to
# to right index which is of size atmost RUN
def insertionSort(arr, left, right):
    for i in range(left + 1, right + 1):
        j = i
        while j > left and arr[j] < arr[j - 1]:
            arr[j], arr[j - 1] = arr[j - 1], arr[j]
            j -= 1


# Merge function merges the sorted runs
def merge(arr, start, mid, end):
    if mid == end:
        return

    first = arr[start:mid + 1]
    second = arr[mid + 1:end + 1]
    i = j = 0
    k = start

    while i < len(first) and j < len(second):
        if first[i] < second[j]:
            arr[k] = first[i]
            i += 1
        else:
            arr[k] = second[j]
            j += 1
        k += 1

    while i < len(first):
        arr[k] = first[i]
        i += 1
        k += 1

    while j < len(second):
        arr[k] = second[j]
        j += 1
        k += 1


def timSort(arr):
    n = len(arr)
    min_run = calcMinRun(n)

    for start in range(0, n, min_run):
        end = min(start + min_run - 1, n - 1)
        insertionSort(arr, start, end)

    size = min_run
    while size < n:
        for left in range(0, n, 2 * size):
            mid = min(n - 1, left + size - 1)
            right = min((left + 2 * size - 1), (n - 1))

            if mid < right:
                merge(arr, left, mid, right)

        size = 2 * size


if __name__ == "__main__":
    arr = []
    i = 0
    while True:
        try:
            arr.append(int(input(f"Enter {i}th element ( Enter q if done ): ")))
            i += 1
        except:
            break

    print("Given Array is")
    print(arr)

    # Function Call
    timSort(arr)

    print("After Sorting Array is")
    print(arr)