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

n, score, p = map(int, input().split())

if n == 0:
    print(1)
else:
    scores = list(map(int, list(input().split())))

    if n == p and scores[-1] >= score:
        print(-1)
    else:
        scores.append(score)
        scores.sort(reverse=True)

        res = 0
        for i in range(len(scores)):
            if scores[i] == score:
                res = i
                break

        print(res + 1)
