#Advent of code day 5

import re

with open('day5.txt') as fp:
    lines = fp.readlines()
    lines2 = []

    biggest = 0

    for line in lines:
        line = re.sub("[FL]", "0", line)
        line = re.sub("[BR]", "1", line)

        val = int(line, 2)
        if val > biggest:
            biggest = val
        lines2.append(val)
    
    print(biggest)
    lines2.sort()
    
    i = 0
    while i < len(lines2)-1:
        if lines2[i]-lines2[i+1] == -2:
            print(lines2[i]+1)
        i += 1