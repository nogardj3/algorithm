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

origin = list(input())

count = 0
for i in range(n - 1):
    a = origin.copy()
    b = list(input())

    for i in range(len(b)):
        t = b.pop(0)
        if t in a:
            a.remove(t)
        else:
            b.append(t)

    alen = len(a)
    blen = len(b)

    if (
        (alen == 0 and blen == 0)
        or (alen == 1 and blen == 0)
        or (alen == 0 and blen == 1)
        or (alen == 1 and blen == 1)
    ):
        count += 1

print(count)
