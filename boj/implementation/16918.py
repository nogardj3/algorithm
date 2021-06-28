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

r, c, n = map(int, input().split())

origin = []
for i in range(r):
    origin.append(input())

two_state = [["O" for c in range(c)] for r in range(r)]

third_state = [["O" for c in range(c)] for r in range(r)]

d = [(1, 0), (-1, 0), (0, 1), (0, -1)]

for i in range(r):
    for j in range(c):
        if origin[i][j] == "O":
            third_state[i][j] = "."
            for k in range(len(d)):
                nx = i + d[k][0]
                ny = j + d[k][1]
                if nx >= 0 and ny >= 0 and nx < r and ny < c:
                    third_state[nx][ny] = "."

flag = True
for i in range(r):
    for i in range(c):
        if third_state == "O":
            flag = False

one_state = [["O" for c in range(c)] for r in range(r)]


if n == 1:
    for i in range(r):
        print(origin[i])
elif n % 2 == 0:
    for i in range(r):
        print(*two_state[i], sep="")
elif n > 1 and n % 4 == 1:
    for i in range(r):
        print(*one_state[i], sep="")
elif n > 1 and n % 4 == 3:
    for i in range(r):
        print(*third_state[i], sep="")
