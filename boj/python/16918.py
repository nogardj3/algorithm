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
