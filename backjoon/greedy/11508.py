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

n = int(input())
data= []
for i in range(n):
    data.append(int(input()))
data.sort(reverse=True)

for i in range(2, n, 3):
    data[i] = 0

print(sum(data))