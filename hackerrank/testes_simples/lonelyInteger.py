def lonelyInteger(arr):
    # Write your code here
    sum_set_arr = sum(set(arr))
    sum_list = sum(arr)
    return (sum_set_arr * 2) - sum_list

lonelyInteger([4, 1, 2, 4, 6, 1, 3])