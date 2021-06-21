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
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n = int(input())
data = list(input().split())

direction = {
    "R": [0, 1],
    "L": [0, -1],
    "U": [-1, 0],
    "D": [1, 0],
}
pos = [0, 0]
for i in range(len(data)):
    pos[0] += direction[data[i]][0]
    pos[1] += direction[data[i]][1]
    if pos[0] < 0:
        pos[0] = 0
    elif pos[0] > n - 1:
        pos[0] = n - 1
    if pos[1] < 0:
        pos[1] = 0
    elif pos[1] > n - 1:
        pos[1] = n - 1

print(f"{pos[0]+1} {pos[1]+1}")
