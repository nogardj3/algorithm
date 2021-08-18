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

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
first = data[n - 1]
second = data[n - 2]

res = 0
if first == second:
    res = first * m
else:
    length = m // (k + 1)
    left = m % length
    print(length, left)
    res = (first * k + second * 1) * length + left * first

print(res)
