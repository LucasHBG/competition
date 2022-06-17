def diagonalDifference(arr):
    # Write your code here
    size = len(arr)
    ltr = 0
    rtl = 0
    for row in range(size):
        ltr += arr[row][row]
        rtl += arr[row][size - row - 1]
    
    return abs(ltr - rtl)

diagonalDifference([[1, 2, 3], [4, 5, 6], [9, 8, 9]])