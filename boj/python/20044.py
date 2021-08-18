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

n = int(input())

data = list(map(int, input().split()))
data.sort()

deqq = collections.deque(data)

res = 1e9

while len(deqq) != 0:
    min_val = deqq.popleft()
    max_val = deqq.pop()

    res = min(res, (min_val + max_val))

print(res)
