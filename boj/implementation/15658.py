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
