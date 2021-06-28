import itertools
import heapq
import bisect
import collections
import math
import time
import re


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


def get_dist(idx, pos):
    if idx == 1:
        return pos
    elif idx == 2:
        return n + m + n - pos
    elif idx == 3:
        return n + m + n + m - pos
    else:
        return n + pos


n, m = map(int, input().split())

l = int(input())
data = []

for i in range(l):
    idx, pos = map(int, input().split())
    data.append(get_dist(idx, pos))

d_i, d_p = map(int, input().split())
pos = get_dist(d_i, d_p)

res = 0
for i in range(l):
    clockwise = abs(pos - data[i])
    res += min(clockwise, n + m + n + m - clockwise)

print(res)
