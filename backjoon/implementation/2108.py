import itertools
import heapq
import bisect
import collections
import math
import sys
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

n = int(sys.stdin.readline().rstrip())

data = []
for i in range(n):
    data.append(int(sys.stdin.readline().rstrip()))

# 1
print(round(sum(data) / n))

# 2
data.sort()
print(data[(n // 2)])

# 3
freq = {}
max_val = 0
for i in range(n):
    if data[i] not in freq:
        freq[data[i]] = 1
    else:
        freq[data[i]] += 1
    max_val = max(max_val, freq[data[i]])

aa = []
for key, val in freq.items():
    if val == max_val:
        aa.append(key)
aa.sort()

print(aa[0] if len(aa) == 1 else aa[1])

# 4
print(max(data) - min(data))
