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

m = int(input())
s = []
for i in range(m):
    a = input().split()
    if a[0] == "all":
        s.clear()
        s = [i for i in range(1, 21)]
        continue
    elif a[0] == "empty":
        s.clear()
        continue
    num = int(a[1])
    if a[0] == "add":
        if num not in s:
            s.append(num)
    elif a[0] == "remove":
        if num in s:
            s.remove(num)
    elif a[0] == "check":
        if num in s:
            print(1)
        else:
            print(0)
    elif a[0] == "toggle":
        if num in s:
            s.remove(num)
        else:
            s.append(num)
