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
    data.append(int(input()))

count = 0
for i in range(n - 1, 0, -1):
    if data[i] <= data[i - 1]:
        count += data[i - 1] - data[i] + 1
        data[i - 1] = data[i] - 1

print(count)
