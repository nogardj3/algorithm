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

swap_1 = -1
for i in range(n - 1):
    if data[i] > data[i + 1]:
        swap_1 = i

if swap_1 == -1:
    print(-1)
else:
    swap_2 = swap_1 + 1
    for i in range(swap_2, n):
        if data[i] < data[swap_1]:
            swap_2 = i
    data[swap_1], data[swap_2] = data[swap_2], data[swap_1]

    tmp = data[swap_1 + 1 :]
    tmp.sort(reverse=True)
    res = data[: swap_1 + 1] + tmp

    for item in res:
        print(item, end=" ")
    print()
