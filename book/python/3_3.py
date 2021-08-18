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

res = 0
for i in range(n):
    data = list(map(int, input().split()))

    minimum = min(data)
    res = max(minimum, res)

print(res)
