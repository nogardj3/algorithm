import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

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

data = dict()

count = 0
for i in range(n):
    cow, lr = map(int, input().split())
    if cow not in data:
        data[cow] = lr
    else:
        if data[cow] != lr:
            count += 1
            data[cow] = lr
            # print("=====", cow, lr)

print(count)
