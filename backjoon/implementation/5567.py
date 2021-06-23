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
m = int(input())

friends = dict()
for i in range(m):
    a, b = map(int, input().split())
    if a not in friends:
        friends[a] = []
    friends[a].append(b)
    if b not in friends:
        friends[b] = []
    friends[b].append(a)

res = set()
if 1 in friends:
    for item in friends[1]:
        res.add(item)
        if item in friends:
            for item2 in friends[item]:
                res.add(item2)

    print(len(res) - 1)
else:
    print(0)
