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

n, k = map(int, input().split())

data = list(input())

res = 0
for i in range(n):
    if data[i] == "P":
        min_index = (i - k) if i - k > 0 else 0
        max_index = (i + k) if i + k <= n - 1 else n - 1
        for j in range(min_index, max_index + 1):
            if data[j] == "H":
                data[j] = "X"
                res += 1
                break

print(res)
