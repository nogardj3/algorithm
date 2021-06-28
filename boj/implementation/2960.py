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

n, k = map(int, input().split())

index = 0

check = [0] * 1001
flag = False
for i in range(2, n + 1):
    for j in range(i, n + 1, i):
        if check[j] == 0:
            check[j] = 1
            index += 1
            # print("   ", j)
        if index == k:
            flag = True
            break
    if flag:
        print(j)
        break
