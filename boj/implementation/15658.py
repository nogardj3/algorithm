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
ops = list(map(int, input().split()))


def dfs(idx, res):
    global min_val, max_val

    if idx == n:
        min_val = min(min_val, res)
        max_val = max(max_val, res)
        return

    if ops[0] > 0:
        ops[0] -= 1
        dfs(idx + 1, res + data[idx])
        ops[0] += 1
    if ops[1] > 0:
        ops[1] -= 1
        dfs(idx + 1, res - data[idx])
        ops[1] += 1
    if ops[2] > 0:
        ops[2] -= 1
        dfs(idx + 1, res * data[idx])
        ops[2] += 1
    if ops[3] > 0:
        ops[3] -= 1
        dfs(idx + 1, int(res / data[idx]))
        ops[3] += 1


min_val = 1e9
max_val = -1e9

dfs(1, data[0])
print(max_val)
print(min_val)
