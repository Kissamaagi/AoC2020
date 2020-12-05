# Advent of code day 2

import re

with open('passwd.txt') as fp:
    passwords = fp.readlines()

    valid = 0

    for password in passwords:
        passwdarray = re.split('[^a-z0-9]', password)
        minval = int(passwdarray[0])
        maxval = int(passwdarray[1])
        character = passwdarray[2]
        word = passwdarray[4]

        #part1
        #i = 0
        #for char in word:
        #    if char == character:
        #        i += 1    
        #if (i >= minval and i <= maxval):
        #    valid += 1

        #part 2
        if (word[minval-1] == character and word[maxval-1] == character):
            valid = valid
        elif (word[minval-1] == character or word[maxval-1] == character):
            valid += 1
    
    print(valid)