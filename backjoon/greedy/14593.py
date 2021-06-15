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
n, m = int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n = int(input())

res_index = 0
max_s = 0
max_c = 0
max_l = 0

for i in range(n):
    s, c, l = map(int, input().split())
    # 총합 비교
    if max_s < s:
        res_index = i
        max_s = s
        max_c = c
        max_l = l
    elif max_s == s:
        # 제출 횟수 비교
        if max_c > c:
            res_index = i
            max_s = s
            max_c = c
            max_l = l
        elif max_c == c:
            if max_l > l:
                res_index = i
                max_s = s
                max_c = c
                max_l = l

print(res_index+1)