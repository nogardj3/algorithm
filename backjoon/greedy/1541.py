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

arr = input().split('-')

res = 0

for i in arr[0].split('+'):
    res += int(i)
for i in arr[1:]:
    for j in i.split('+'):
        res -= int(j)

print(res)