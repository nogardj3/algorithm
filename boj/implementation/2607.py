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
