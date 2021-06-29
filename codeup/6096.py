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

d = []
for i in range(19):
    d.append(list(map(int, input().split())))

n = int(input())
for i in range(n):
    x, y = map(int, input().split())
    x -= 1
    y -= 1
    for j in range(19):
        if d[j][int(y)] == 0:
            d[j][int(y)] = 1
        else:
            d[j][int(y)] = 0

        if d[int(x)][j] == 0:
            d[int(x)][j] = 1
        else:
            d[int(x)][j] = 0

for i in range(19):
    for j in range(19):
        print(d[i][j], end=" ")
    print()
