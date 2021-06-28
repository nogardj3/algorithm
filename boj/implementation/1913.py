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

n = int(input())
m = int(input())

op = [(1, 0), (0, 1), (-1, 0), (0, -1)]

res = [[0 for col in range(n)] for row in range(n)]

cur_op = 0
cur_num = pow(n, 2)
cur_pos = [0, 0]

while cur_num != 0:
    res[cur_pos[0]][cur_pos[1]] = cur_num
    cur_num -= 1
    if cur_pos[0] + op[cur_op][0] == -1 or cur_pos[1] + op[cur_op][1] == -1:
        cur_op = (cur_op + 1) % 4
    elif cur_pos[0] + op[cur_op][0] == n or cur_pos[1] + op[cur_op][1] == n:
        cur_op = (cur_op + 1) % 4
    elif res[cur_pos[0] + op[cur_op][0]][cur_pos[1] + op[cur_op][1]] != 0:
        cur_op = (cur_op + 1) % 4
    cur_pos[0] += op[cur_op][0]
    cur_pos[1] += op[cur_op][1]

for j in range(n):
    print(*res[j])

for i in range(n):
    for j in range(n):
        if res[i][j] == m:
            print(i + 1, j + 1)
            exit(0)
