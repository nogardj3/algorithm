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

n = 10001
data = [0] * n

last_num = 0
for i in range(1, n):
    num = i + sum(map(int, str(i)))
    if num <= n - 1:
        data[num] = 1

for i in range(1, n):
    if data[i] == 0:
        print(i)
