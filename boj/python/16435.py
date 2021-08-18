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

for i in range(n):
    if data[i] <= l:
        l += 1
    else:
        break

print(l)
