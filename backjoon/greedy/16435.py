import itertools
import heapq
import bisect
import collections
import math
import sys
import time

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n, l = map(int, input().split())

data = list(map(int, input().split()))
data.sort()

for i in range(n):
    if (data[i] <= l):
        l += 1
    else:
        break

print(l)
