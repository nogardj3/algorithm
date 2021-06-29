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


def find_max(n_1, n_2, n_left, isRow):
    global data

    max_num = 0
    last_count = 1

    for i in range(1, n):
        if data[n_1][i - 1] != data[n_1][i]:
            max_num = max(last_count, max_num)
            last_count = 1
        else:
            last_count += 1
    max_num = max(last_count, max_num)
    last_count = 1

    for i in range(1, n):
        if data[i - 1][n_2] != data[i][n_2]:
            max_num = max(last_count, max_num)
            last_count = 1
        else:
            last_count += 1
    max_num = max(last_count, max_num)
    last_count = 1

    if isRow:
        for i in range(1, n):
            if data[n_left][i - 1] != data[n_left][i]:
                max_num = max(last_count, max_num)
                last_count = 1
            else:
                last_count += 1

    else:
        for i in range(1, n):
            if data[i - 1][n_left] != data[i][n_left]:
                max_num = max(last_count, max_num)
                last_count = 1
            else:
                last_count += 1
    return max_num


n = int(input())

data = []
for i in range(n):
    data.append(list(input()))

max_num = 0

for i in range(n):
    for j in range(n - 1):
        data[i][j], data[i][j + 1] = data[i][j + 1], data[i][j]
        max_num = max(find_max(i, j, j + 1, isRow=False), max_num)
        data[i][j], data[i][j + 1] = data[i][j + 1], data[i][j]

for i in range(n):
    for j in range(n - 1):
        data[j][i], data[j + 1][i] = data[j + 1][i], data[j][i]
        max_num = max(find_max(j, i, j + 1, isRow=True), max_num)
        data[j][i], data[j + 1][i] = data[j + 1][i], data[j][i]

print(max_num)
