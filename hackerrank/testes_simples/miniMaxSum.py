def miniMaxSum(arr):
    # Write your code here
    size_arr = len(arr)
    minimum = 0 
    arr.sort()
    
    for i in range(size_arr - 1):
        minimum += arr[i]
    
    maximum = 0

    for i in range(size_arr - 1):
        maximum += arr[size_arr - i - 1]
    

    print(minimum, maximum)