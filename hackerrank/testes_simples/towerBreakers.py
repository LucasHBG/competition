def towerBreakers(n, m):
    # Write your code here
    if(m == 1):
        return 2
    elif(n % 2 == 0):
        return 2
    else:
        return 1
    

towerBreakers(100001, 1) 