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
data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

a, b = map(int, input().split())

data = []
for i in range(1, 1000):
    for j in range(1, i + 1):
        if len(data) < 1000:
            data.append(i)
        else:
            break
    if len(data) >= 1000:
        break

res = 0
for i in range(a - 1, b):
    res += data[i]

print(res)
