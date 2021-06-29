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
