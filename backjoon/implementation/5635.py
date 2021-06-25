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
n = int(input())

res = dict()
max_val = ("mv", 19890000)
min_val = ("mv", 20210000)


def make_two(stst):
    return "0" + stst if len(stst) == 1 else stst


for i in range(n):
    t = list(input().split())
    numnum = int(t[3] + make_two(t[2]) + make_two(t[1]))
    res[t[0]] = numnum
    if max_val[1] < numnum:
        max_val = (t[0], numnum)
    if min_val[1] > numnum:
        min_val = (t[0], numnum)

print(max_val[0])
print(min_val[0])
