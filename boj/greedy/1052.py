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

n, k = map(int, input().split())

res = 0
while bin(n).count("1") > k:
    a = 2 ** (bin(n)[::-1].index("1"))
    res += a
    n += a

print(res)
