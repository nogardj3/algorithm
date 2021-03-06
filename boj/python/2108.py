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

n = int(sys.stdin.readline().rstrip())

data = []
for i in range(n):
    data.append(int(sys.stdin.readline().rstrip()))

# 1
print(round(sum(data) / n))

# 2
data.sort()
print(data[(n // 2)])

# 3
freq = {}
max_val = 0
for i in range(n):
    if data[i] not in freq:
        freq[data[i]] = 1
    else:
        freq[data[i]] += 1
    max_val = max(max_val, freq[data[i]])

aa = []
for key, val in freq.items():
    if val == max_val:
        aa.append(key)
aa.sort()

print(aa[0] if len(aa) == 1 else aa[1])

# 4
print(max(data) - min(data))
