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

n, m = map(int, input().split())

data = list(map(int, input().split()))

for i in range(m):
    data.sort()
    data[0] = data[0] + data[1]
    data[1] = data[0]

print(sum(data))
