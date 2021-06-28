import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

# FAILED

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

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

# for c in range(n):
#     print(data[c])

print(data[ox - 1][oy - 1])
