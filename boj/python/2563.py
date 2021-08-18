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

matrix = [[0] * 101 for i in range(101)]

for i in range(n):
    w, h = map(int, input().split())
    for i in range(w, w + 10):
        for j in range(h, h + 10):
            matrix[i][j] = 1

count = 0
for i in range(101):
    count += matrix[i].count(1)

print(count)
