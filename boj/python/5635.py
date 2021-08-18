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

res = dict()
max_val = ("mv", 19890000)
min_val = ("mv", 20210000)


def make_two(stst):
    return "0" + stst if len(stst) == 1 else stst


for i in range(n):
    t = list(input().split())
    numnum = int(t[3] + make_two(t[2]) + make_two(t[1]))
    res[t[0]] = numnum
    if max_val[1] < numnum:
        max_val = (t[0], numnum)
    if min_val[1] > numnum:
        min_val = (t[0], numnum)

print(max_val[0])
print(min_val[0])
