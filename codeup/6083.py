import itertools
import heapq
import bisect
import collections
import math
import sys

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n, m = int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n, m, p = map(int, input().split())
count = 0

for i in range(n):
    for j in range(m):
        for k in range(p):
            print(i, j, k)
            count += 1

print(count)