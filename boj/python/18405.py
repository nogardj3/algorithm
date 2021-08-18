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

d = [(1, 0), (-1, 0), (0, 1), (0, -1)]

n, k = map(int, input().split())

data = []
for i in range(n):
    data.append(list(map(int, input().split())))

s, ox, oy = map(int, input().split())

virus_list = []
for i in range(n):
    for j in range(n):
        if data[i][j] != 0:
            virus_list.append([data[i][j], i, j, 0])
virus_list.sort()

while virus_list:
    virus, x, y, time = virus_list.pop(0)
    if time == s:
        break
    else:
        for (dx, dy) in d:
            if 0 <= x + dx < n and 0 <= y + dy < n and data[x + dx][y + dy] == 0:
                data[x + dx][y + dy] = virus
                virus_list.append([virus, x + dx, y + dy, time + 1])

print(data[ox - 1][oy - 1])
