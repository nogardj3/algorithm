import itertools
import heapq
import bisect
import collections
import math
import time
import re


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

c, r = map(int, input().split())
k = int(input())

op = [(1, 0), (0, 1), (-1, 0), (0, -1)]

res = [[0 for col in range(c)] for row in range(r)]

cur_op = 0
cur_num = 1
cur_pos = [0, 0]

while cur_num != c * r + 1:
    res[cur_pos[0]][cur_pos[1]] = cur_num
    cur_num += 1
    if cur_pos[0] + op[cur_op][0] == -1 or cur_pos[1] + op[cur_op][1] == -1:
        cur_op = (cur_op + 1) % 4
    elif cur_pos[0] + op[cur_op][0] == r or cur_pos[1] + op[cur_op][1] == c:
        cur_op = (cur_op + 1) % 4
    elif res[cur_pos[0] + op[cur_op][0]][cur_pos[1] + op[cur_op][1]] != 0:
        cur_op = (cur_op + 1) % 4
    cur_pos[0] += op[cur_op][0]
    cur_pos[1] += op[cur_op][1]

for i in range(r):
    for j in range(c):
        if res[i][j] == k:
            print(
                j + 1,
                i + 1,
            )
            exit(0)

print(0)
