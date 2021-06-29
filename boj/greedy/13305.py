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

dist = list(map(int, input().split()))
fuel = list(map(int, input().split()))

dist.append(0)
res = 0

min_fuel = fuel[0]
for i in range(len(fuel)):
    if fuel[i] < min_fuel:
        min_fuel = fuel[i]
    res += min_fuel * dist[i]

print(res)
