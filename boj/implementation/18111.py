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

# FAILED

n, m, b = map(int, input().split())
data = []
for i in range(n):
    data.append(list(map(int, input().split())))

res_height = 0
res = 1e9

for i in range(257):
    max = 0
    min = 0
    for j in range(n):
        for k in range(m):
            if data[j][k] < i:
                min += i - data[j][k]
            else:
                max += data[j][k] - i
    if max + b < min:
        continue
    time = 2 * max + min
    if time <= res:
        res = time
        res_height = i

print(res, res_height)
