def linear(arr,x):
    for i in arr:
        if i==x:
            print('Number Found at index: ',arr.index(i))
            return
    print('Number not found')

n=int(input('Enter the no. of element: '))
print('Enter the elements in array')
arr=[int(input()) for i in range(n)]
x=int(input('Enetr the number to search: '))
linear(arr,x)