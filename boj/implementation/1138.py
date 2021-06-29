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

# FAILED

n = int(input())

data = list(map(int, input().split()))

res = [0] * n
for i in range(1, n + 1):
    count = 0
    for j in range(n):
        if count == data[i - 1] and res[j] == 0:
            res[j] = i
            break
        elif res[j] == 0:
            count += 1
print(*res)
