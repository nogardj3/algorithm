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

t = int(input())

for _ in range(t):
    l, n = map(int, input().split())

    min_value = 0
    max_value = -1

    for _ in range(n):
        ant = int(input())
        min_value = max(min_value, min(l - ant, ant))
        max_value = max(max_value, max(l - ant, ant))
    print(min_value, max_value)
