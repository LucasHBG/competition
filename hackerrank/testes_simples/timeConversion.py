#!/bin/python3

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(str_time):
    
    if(str_time[8] == 'A'):
        if(str_time[0:2] == '12'):
            str_time = str_time.replace(str_time[0:2], '00')

    else:
        if(str_time[0:2] != '12'):
            hora = str(int(str_time[0:2]) + 12)
            str_time = str_time.replace(str_time[0:2], hora)

    str_time = str_time.replace(str_time[-2:], "")
    return str_time

timeConversion("12:05:45AM")
timeConversion("07:05:45PM")