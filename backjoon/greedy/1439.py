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
s = input()

initial = s[0]
flagflag = False
count = 0

for i in range(len(s)):
    if (initial != s[i]):
        if (flagflag == False):
            count += 1
        flagflag = True
    else:
        if (flagflag == True):
            flagflag = False

print(count)

