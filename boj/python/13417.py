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

t = int(input())

for i in range(t):
    n = int(input())

    data = list(input().split())

    a = collections.deque()
    a.append(data[0])
    for i in range(1, n):
        if data[i] > a[0]:
            a.append(data[i])
        else:
            a.appendleft(data[i])
    print("".join(a))
