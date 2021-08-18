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

k = int(input())

data = dict()
muls = []
for i in range(6):
    d, m = map(int, input().split())
    if d in data:
        data[d].append(m)
    else:
        data[d] = [m]
    muls.append(m)

max = 1
for item in data:
    if len(data[item]) == 1:
        max *= data[item][0]

mul_sum = 0
for i in range(0, len(muls)):
    mul_sum += muls[i - 1] * muls[i]

print((max - (3 * max - mul_sum)) * k)
