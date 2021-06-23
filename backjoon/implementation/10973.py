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
