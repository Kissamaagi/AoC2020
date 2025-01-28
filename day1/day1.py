#Advent of code day 1

with open('exp.txt') as fp:
    lines = fp.readlines()

    for x in lines:
        for y in lines:
            # Part 1
            if (int(x)+int(y)) == 2020:
                print (int(x)*int(y))

            #Part 2
            for z in lines:
                if (int(x)+int(y)+int(z)) == 2020:
                    print(int(x)*int(y)*int(z))