import itertools
import heapq
import bisect
import collections
import math
import sys

n = input()
res = 0

for i in n:
    res = max(res + int(i), res * int(i))

print(res)
