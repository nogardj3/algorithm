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

mx = 10
my = 10

d = []
for i in range(mx):
    d.append(list(map(int, input().split())))

x = 1
y = 1

while True:
    if d[x][y] == 2:
        d[x][y] = 9
        break

    d[x][y] = 9

    if d[x][y + 1] != 1:
        y = y + 1
    elif d[x + 1][y] != 1:
        x = x + 1
    else:
        break


for e in range(mx):
    for r in range(my):
        print(d[e][r], end=" ")
    print()
