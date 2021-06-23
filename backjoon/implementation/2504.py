import itertools
import heapq
import bisect
import collections
import math
import time
import re

# FAILED

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

stackS = []
stackB = []
coeff = 1
isPaired = True
ans = 0

for i in range(len(target_str)):
    if target_str[i] == "(":
        stackS.append(i)
        coeff *= 2
    elif target_str[i] == "[":
        stackB.append(i)
        coeff *= 3
    elif target_str[i] == ")":
        if stackS:
            if target_str[i - 1] == "(":
                ans += coeff
            stackS.pop()
            coeff //= 2
        else:
            isPaired = False
            break
    elif target_str[i] == "]":
        if stackB:
            if target_str[i - 1] == "[":
                ans += coeff
            stackB.pop()
            coeff //= 3
        else:
            isPaired = False
            break

if not stackB and not stackS and isPaired:
    print(ans)
else:
    print(0)
