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
data = list(map(int, input().split()))
m = int(input())

for i in range(m):
    op1, op_index = map(int, input().split())

    if op1 == 1:
        for j in range(op_index - 1, n, op_index):
            data[j] = 0 if data[j] == 1 else 1
    elif op1 == 2:
        data[op_index - 1] = 0 if data[op_index - 1] == 1 else 1
        for j in range(1, n):
            if op_index - 1 + j >= n or op_index - 1 - j < 0:
                break
            elif data[op_index - 1 - j] == data[op_index - 1 + j]:
                data[op_index - 1 - j] = 0 if data[op_index - 1 - j] == 1 else 1
                data[op_index - 1 + j] = 0 if data[op_index - 1 + j] == 1 else 1
            else:
                break

for i in range(0, n, 20):
    print(*data[i : i + 20])
