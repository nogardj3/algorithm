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
s = 0
c = 0

while True:
    s += c
    c += 1
    if s >= n:
        break

print(s)
