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
a, b = map(int, input().split())

count = 1
while (a < b):
    if (b % 2 == 0):
        b //= 2
        count += 1
    elif (b % 10 == 1):
        b //= 10
        count += 1
    else:
        break;

print(count if b == a else -1)