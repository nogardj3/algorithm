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

data = []
for i in range(n):
    data.append(int(sys.stdin.readline()))

data.sort()
res = 0

for i in range(n):
    res += abs(data[i] - (i + 1))

print(res)
