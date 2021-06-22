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

target_str = input()

res = 0
data = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for item in data:
    count = target_str.find(item)
    if count != -1:
        count = target_str.count(item)
        target_str = target_str.replace(item, "0")
    res += 0 if count == -1 else count

one_char = len(target_str) - target_str.count("0")
print(res + one_char)
