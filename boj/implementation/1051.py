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
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n, m = map(int, input().split())

data = []
for i in range(n):
    data.append(input())

max_num = min(n, m)

while max_num > 0:
    for i in range(n - max_num):
        for j in range(m - max_num):
            if (
                data[i][j] == data[i + max_num][j]
                and data[i][j] == data[i][j + max_num]
                and data[i][j] == data[i + max_num][j + max_num]
            ):
                print(pow(max_num + 1, 2))
                exit(0)
    max_num -= 1

print(1)
