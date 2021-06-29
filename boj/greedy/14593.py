import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

############################################
import sys

input = lambda: sys.stdin.readline().strip()
############################################

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

print(res_index + 1)
