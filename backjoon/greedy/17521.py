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

n, w = map(int, input().split())

data = []
for i in range(n):
    data.append(int(input()))

count = 0
prev_val = data[0]

for i in range(1, n):
    if (prev_val > data[i] and count != 0):
        w += count * prev_val
        count = 0
    elif (prev_val < data[i] and count == 0):
        count = w // prev_val
        w -= count * prev_val
    prev_val= data[i]

if (count != 0):
    w+= count * data[n-1]

print(w)