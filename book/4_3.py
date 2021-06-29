import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

############################################
import sys

input = lambda: sys.stdin.readline().strip()
############################################

cr = input()
row = int(cr[1]) - 1
column = int(ord(cr[0]) - int(ord("a")))

res = 0
case = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2), (-1, 2), (-1, -2)]

for item in case:
    nr = row + item[0]
    nc = column + item[1]

    if (nr >= 0 and nr <= 7) and (nc >= 0 and nc <= 7):
        res += 1

print(res)
