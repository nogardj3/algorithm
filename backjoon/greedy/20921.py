import itertools
import heapq
import bisect
import collections
import math
import sys

# FAILED

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
n, m = map(int, input().split())

ll = []
for i in range(n):
    ll.append(i + 1)

count = 0
for k in range(n):
    if count == m:
        break;
    for i in range(n - 1, k, -1):
        if (ll[i] > ll[i - 1]):
            ll[i],ll[i-1] = ll[i-1],ll[i]
            count += 1
        if count == m:
            break;

print(ll)