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

h, w = map(int, input().split())
n = int(input())

d = []
for i in range(h):
    d.append([])
    for j in range(w):
        d[i].append(0)

for i in range(n):
    l, t, x, y = map(int, input().split())
    x -= 1
    y -= 1
    if t == 0:
        for j in range(y, y + l):
            d[x][j] = 1
    else:
        for j in range(x, x + l):
            d[j][y] = 1

for e in range(h):
    for r in range(w):
        print(d[e][r], end=" ")
    print()
