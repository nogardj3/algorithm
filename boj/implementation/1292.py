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

a, b = map(int, input().split())

data = []
for i in range(1, 1000):
    for j in range(1, i + 1):
        if len(data) < 1000:
            data.append(i)
        else:
            break
    if len(data) >= 1000:
        break

res = 0
for i in range(a - 1, b):
    res += data[i]

print(res)
