import itertools
import heapq
import bisect
import collections
import math
import sys

s = input()

initial = s[0]
flagflag = False
count = 0

for i in range(len(s)):
    if (initial != s[i]):
        if (flagflag == False):
            count += 1
        flagflag = True
    else:
        if (flagflag == True):
            flagflag = False

print(count)

