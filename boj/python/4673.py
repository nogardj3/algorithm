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

n = 10001
data = [0] * n

last_num = 0
for i in range(1, n):
    num = i + sum(map(int, str(i)))
    if num <= n - 1:
        data[num] = 1

for i in range(1, n):
    if data[i] == 0:
        print(i)
