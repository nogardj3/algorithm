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

data = []
for i in range(k):
    data.append(i + 1)
data.sort(reverse=True)

idx = 0
data_sum = sum(data)
while data_sum < n:
    data[idx] += 1
    data_sum += 1
    idx = idx + 1 if idx < k - 1 else 0

print(data[0] - min(data) if data_sum == n else -1)
