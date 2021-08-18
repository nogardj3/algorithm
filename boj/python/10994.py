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


def draw(n, idx):
    if n == 1:
        data[idx][idx] = "*"
        return

    for i in range(idx, 4 * n - 3 + idx):
        data[idx][i] = "*"
        data[i][idx] = "*"
        data[4 * n - 3 + idx - 1][i] = "*"
        data[i][4 * n - 3 + idx - 1] = "*"
    return draw(n - 1, idx + 2)


n = int(input())

data = []
for i in range(4 * n - 3):
    data.append([" "] * (4 * n - 3))

draw(n, 0)

for i in range(len(data)):
    for j in range(len(data[i])):
        print(data[i][j], end="")
    print()
