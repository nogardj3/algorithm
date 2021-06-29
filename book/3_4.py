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

count = 0
while True:
    while n % m != 0:
        n -= 1
        count += 1
    print(n, m, count)
    if n == 1:
        break
    while n % m == 0:
        n = n // m
        count += 1
    print(n, m, count)
    if n == 1:
        break

print(count)
