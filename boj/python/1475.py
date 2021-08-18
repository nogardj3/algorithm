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

data = input()

arr = [0] * 10

for item in data:
    arr[int(item)] += 1

s = arr[6] + arr[9]
t = s // 2
arr[6] = t
arr[9] = s - t

print(max(arr))
