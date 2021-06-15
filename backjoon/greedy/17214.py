import itertools
import heapq
import bisect
import collections
import math
import sys
import re

s = input()
a = s.split('+')
res = ""

for item in a:
    if item != '0' :
        count = item.count('x')

        num = int(re.findall('-?\d+', item)[0])
        num2 = int(num / (count + 1))
        print (num2)
        mod = str(num2).replace('1','')

        tt = mod + 'x' * (count + 1) 
        res += tt + '+'

print(res + 'W')