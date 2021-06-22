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

t = int(input())

res = 0
for i in range(t):
    target_str = input()
    checks = {}

    count = 1
    for i in range(len(target_str)):
        if not (target_str[i] in checks):
            checks[target_str[i]] = True
        elif target_str[i - 1] == target_str[i]:
            pass
        else:
            count = 0
            break
    res += count

print(res)
