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
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
n = input()

idx = 0
for i in range(len(n)):
    if (n[i] == 'U'and idx==0):
        idx = 1
    if (n[i] == 'C' and idx==1):
        idx = 2
    if (n[i] == 'P' and idx==2):
        idx = 3
    if (n[i] == 'C' and idx==3):
        idx = 4
    if idx == 4:
        break;

print('I love UCPC' if idx == 4 else 'I hate UCPC')