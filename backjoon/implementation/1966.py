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
t = int(input())

for i in range(t):
    n, m = map(int, input().split())
    data = list(map(int, input().split()))

    count = 0
    while True:
        if data[0] == max(data):
            count += 1
            if m == 0:
                print(count)
                break
            else:
                del data[0]
                m -= 1
        else:
            data.append(data[0])
            del data[0]
            m = len(data) - 1 if m == 0 else m - 1
