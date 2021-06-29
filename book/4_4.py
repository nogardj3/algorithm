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

n, m = map(int, input().split())
a, b, d = map(int, input().split())

data = []
for i in range(n):
    data.append(list(map(int, input().split())))
visits = [[0] * m for _ in range(n)]
directions = [(-1, 0), (0, 1), (1, 0), (-1, 0)]

visits[a][b] = 1


def turn_left():
    global d
    d -= 1
    if d == -1:
        d = 3


count = 1
turn_time = 0
while True:
    turn_left()
    nx = a + directions[d][0]
    ny = b + directions[d][1]

    if visits[nx][ny] == 0 and data[nx][ny] == 0:
        visits[nx][ny] = 1
        a = nx
        b = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1
    if turn_time == 4:
        nx = a - directions[d][0]
        ny = b - directions[d][1]

        if data[nx][ny] == 0:
            a = nx
            b = ny
        else:
            break
        turn_time = 0

print(count)
