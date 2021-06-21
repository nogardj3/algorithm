import itertools
import heapq
import bisect
import collections
import math
import sys

# Failed

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n = int(input())

arr = list(input())
red = arr.count('R')
blue = n - red

ans = min(red, blue)
cnt = 0
for i in range(n):
    if arr[i] != arr[0]: break
    cnt += 1
if arr[0] == 'R': ans = min(ans, red - cnt)
else: ans = min(ans, blue - cnt)

cnt = 0
for i in range(n - 1, -1, -1):
    if arr[i] != arr[n - 1]: break
    cnt += 1

if arr[n - 1] == 'R': ans = min(ans, red - cnt)
else: ans = min(ans, blue - cnt)

print(ans)