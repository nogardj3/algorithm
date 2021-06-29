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

n = 1260
left = [500, 100, 50, 10]

res = 0

print(n, res)
for t in left:
    res += n // t
    n %= t
    print(n, res)
