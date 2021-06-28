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

data = input()

arr = [0] * 10

for item in data:
    arr[int(item)] += 1

s = arr[6] + arr[9]
t = s // 2
arr[6] = t
arr[9] = s - t

print(max(arr))
