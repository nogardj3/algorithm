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

data = []
for i in range(n):
    data.append(input())

max_num = min(n, m)

while max_num > 0:
    for i in range(n - max_num):
        for j in range(m - max_num):
            if (
                data[i][j] == data[i + max_num][j]
                and data[i][j] == data[i][j + max_num]
                and data[i][j] == data[i + max_num][j + max_num]
            ):
                print(pow(max_num + 1, 2))
                exit(0)
    max_num -= 1

print(1)
