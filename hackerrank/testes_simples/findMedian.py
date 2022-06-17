def findMedian(arr):
    # Write your code here
    arr.sort()
    return arr[int(len(arr)/2)]

findMedian([0, 1, 2, 4, 6, 5, 3])