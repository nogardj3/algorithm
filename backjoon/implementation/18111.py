import itertools
import heapq
import bisect
import collections
import math
import time
import re

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

n, m, b = map(int, input().split())
data = []
for i in range(n):
    data.append(list(map(int, input().split())))

res_height = 0
res = 1e9

for i in range(257):
    max = 0
    min = 0
    for j in range(n):
        for k in range(m):
            if data[j][k] < i:
                min += i - data[j][k]
            else:
                max += data[j][k] - i
    if max + b < min:
        continue
    time = 2 * max + min
    if time <= res:
        res = time
        res_height = i

print(res, res_height)
