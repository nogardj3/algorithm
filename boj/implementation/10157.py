import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

############################################
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
