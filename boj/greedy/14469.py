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
    data.append(tuple(map(int, input().split())))

data.sort()

idx = 0
for i in range(n):
    if idx > data[i][0]:
        idx += data[i][1]
    else:
        idx = data[i][0] + data[i][1]

print(idx)
