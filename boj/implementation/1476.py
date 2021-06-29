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

e, s, m = map(int, input().split())

table = [()] * 7981

te = 1
ts = 1
tm = 1
for i in range(1, 7981):
    table[i] = tuple((te, ts, tm))
    te = 1 if te == 15 else te + 1
    ts = 1 if ts == 28 else ts + 1
    tm = 1 if tm == 19 else tm + 1

for i in range(1, 7981):
    if table[i] == tuple((e, s, m)):
        print(i)
        break
