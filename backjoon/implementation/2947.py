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

data = list(map(int, input().split()))

res = [i for i in range(1, 6)]

last = 5
if data == res:
    print(*res)
else:
    while data != res:
        for i in range(last - 1):
            if data[i] > data[i + 1]:
                data[i], data[i + 1] = data[i + 1], data[i]
                print(*data)
        last -= 1
