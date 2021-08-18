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

t = int(input())

for _ in range(t):
    l, n = map(int, input().split())

    min_value = 0
    max_value = -1

    for _ in range(n):
        ant = int(input())
        min_value = max(min_value, min(l - ant, ant))
        max_value = max(max_value, max(l - ant, ant))
    print(min_value, max_value)
