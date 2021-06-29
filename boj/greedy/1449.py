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

n, l = map(int, input().split())

data = list(map(int, input().split()))
data.sort()

count = 1
idx = data[0] + l - 1
for i in range(1, n):
    if idx < data[i]:
        count += 1
        idx = data[i] + l - 1

print(count)
