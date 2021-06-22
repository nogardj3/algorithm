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
n = int(input())

data = []
for i in range(n):
    data.append(tuple(map(int, input().split())))

res = ""
for item in data:
    rank = 1
    for j in data:
        if item[0] < j[0] and item[1] < j[1]:
            rank += 1
    res += str(rank) + " "

print(res)
