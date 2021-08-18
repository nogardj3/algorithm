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

n, m, p = map(int, input().split())
count = 0

for i in range(n):
    for j in range(m):
        for k in range(p):
            print(i, j, k)
            count += 1

print(count)
