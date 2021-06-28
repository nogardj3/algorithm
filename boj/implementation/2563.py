import itertools
import heapq
import bisect
import collections
import math
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
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n = int(input())

matrix = [[0] * 101 for i in range(101)]

for i in range(n):
    w, h = map(int, input().split())
    for i in range(w, w + 10):
        for j in range(h, h + 10):
            matrix[i][j] = 1
            # print(i, j)
            # time.sleep(0.1)

count = 0
for i in range(101):
    count += matrix[i].count(1)

print(count)
