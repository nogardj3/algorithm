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

if n == 1:
    print(1)
    exit(0)

data = list(map(int, input().split()))

if data.count(data[0]) == len(data):
    print(len(data))
    exit(0)

max_count = 1

cur_count = 0
for i in range(n - 1):
    cur_count += 1
    max_count = max(max_count, cur_count)
    if data[i] > data[i + 1]:
        cur_count = 0
    else:
        if i == n - 2:
            cur_count += 1
            max_count = max(max_count, cur_count)

cur_count = 0
for i in range(0, n - 1):
    cur_count += 1
    max_count = max(max_count, cur_count)
    if data[i] < data[i + 1]:
        cur_count = 0
    else:
        if i == n - 2:
            cur_count += 1
            max_count = max(max_count, cur_count)

print(max_count)
