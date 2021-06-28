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
k = int(input())

data = dict()
muls = []
for i in range(6):
    d, m = map(int, input().split())
    if d in data:
        data[d].append(m)
    else:
        data[d] = [m]
    muls.append(m)

max = 1
for item in data:
    if len(data[item]) == 1:
        max *= data[item][0]

mul_sum = 0
for i in range(0, len(muls)):
    mul_sum += muls[i - 1] * muls[i]

print((max - (3 * max - mul_sum)) * k)
