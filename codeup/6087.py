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

for i in range(1, n + 1):
    if i % 3 == 0:
        continue  # 다음 반복 단계로 넘어간다.
    print(i, end=" ")  # i가 짝수가 아닐 때만 실행된다.
