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

data = list(input())

res = 0
for i in range(n):
    if (data[i] == 'P'):
        min_index = (i - k) if i - k > 0 else 0
        max_index = (i + k) if i + k <= n - 1 else n - 1
        for j in range(min_index, max_index + 1):
            if (data[j] == 'H'):
                data[j] = 'X'
                res += 1
                break;

print(res)