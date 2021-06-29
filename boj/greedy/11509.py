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

data = list(map(int, sys.stdin.readline().rstrip().split()))

flags = [0] * (max(data) + 1)

count = 0
for i in range(n):
    if flags[data[i]] == 0:
        count += 1
    else:
        flags[data[i]] -= 1
    flags[data[i] - 1] += 1

print(count)
