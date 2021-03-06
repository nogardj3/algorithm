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

arr = []
for i in range(n):
    arr.append(int(input()))

arr.sort(reverse=True)

res = 0

for i in range(len(arr)):
    res = max(res, arr[i] * (i + 1))

print(res)
