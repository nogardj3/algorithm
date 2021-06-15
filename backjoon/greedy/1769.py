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

n = input()

count = 0
while (len(n) != 1):
    sum = 0
    for i in range(len(n)):
        sum += int(n[i])
    n = str(sum)
    count += 1

print(count)
print('YES' if (int(n) % 3 == 0 and int(n) != 0) else 'NO')