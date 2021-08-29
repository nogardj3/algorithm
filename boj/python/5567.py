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
m = int(input())

friends = dict()
for i in range(m):
    a, b = map(int, input().split())
    if a not in friends:
        friends[a] = []
    friends[a].append(b)
    if b not in friends:
        friends[b] = []
    friends[b].append(a)

res = set()
if 1 in friends:
    for item in friends[1]:
        res.add(item)
        if item in friends:
            for item2 in friends[item]:
                res.add(item2)

    print(len(res) - 1)
else:
    print(0)
