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
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
n = int(input())

dist = list(map(int, input().split()))  # n개 받기
fuel = list(map(int, input().split()))  # n개 받기

dist.append(0)
res = 0

min_fuel = fuel[0]
for i in range(len(fuel)):
    if fuel[i] < min_fuel:
        min_fuel = fuel[i]
    res += min_fuel * dist[i]

print(res)