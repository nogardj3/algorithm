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
m = int(input())

data = list(map(int, input().split()))

res = []

for item in data:
    is_in = False
    for que_item in res:
        # 카운트 늘리기
        if que_item[0] == item:
            is_in = True
            que_item[1] += 1
            break
    if not is_in:
        # 붙이기
        if len(res) < n:
            res.append([item, 1])
        else:
            # 찾기
            min_val = 1e9
            index = -1
            for j in range(len(res) - 1, -1, -1):
                if res[j][1] <= min_val:
                    min_val = res[j][1]
                    index = j
            # 지우기
            res.pop(index)
            # 붙이기
            res.append([item, 1])

res.sort(key=lambda x: (x[0]))

for item in res:
    print(item[0], end=" ")
print()
