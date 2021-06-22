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
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

cr = input()
row = int(cr[1]) - 1
column = int(ord(cr[0]) - int(ord("a")))

res = 0
case = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2), (-1, 2), (-1, -2)]

for item in case:
    nr = row + item[0]
    nc = column + item[1]

    if (nr >= 0 and nr <= 7) and (nc >= 0 and nc <= 7):
        res += 1

print(res)
