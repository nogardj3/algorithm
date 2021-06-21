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
n, k = map(int, input().split())

data = []
for i in range(k):
    data.append(i + 1)
data.sort(reverse=True)

idx = 0
data_sum = sum(data)
while (data_sum < n):
    data[idx] += 1
    data_sum += 1
    idx = idx+1 if idx < k -1 else 0

print(data[0]- min(data) if data_sum == n else -1)