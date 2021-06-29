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

res = 0
for i in range(n):
    res += data[i] * (n - i)

print(res)
