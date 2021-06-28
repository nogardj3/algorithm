import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

# FAILED

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

N = int(input())
print("*" * N + " " * (2 * N - 3) + "*" * N)
for i in range(N - 2):
    print(
        " " * (i + 1)
        + "*"
        + " " * (N - 2)
        + "*"
        + " " * ((N - 2 - i) * 2 - 1)
        + "*"
        + " " * (N - 2)
        + "*"
    )
print(" " * (N - 1) + "*" + " " * (N - 2) + "*" + " " * (N - 2) + "*")
for i in range(N - 3, -1, -1):
    print(
        " " * (i + 1)
        + "*"
        + " " * (N - 2)
        + "*"
        + " " * ((N - 2 - i) * 2 - 1)
        + "*"
        + " " * (N - 2)
        + "*"
    )
print("*" * N + " " * (2 * N - 3) + "*" * N)
