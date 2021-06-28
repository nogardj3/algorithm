import itertools
import heapq
import bisect
import collections
import math
import time
import re


# FAILED

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n = int(input())

data = list(map(int, input().split()))

res = [0] * n
for i in range(1, n + 1):
    count = 0
    for j in range(n):
        if count == data[i - 1] and res[j] == 0:
            res[j] = i
            break
        elif res[j] == 0:
            count += 1
print(*res)
