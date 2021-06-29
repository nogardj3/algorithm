import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy
import copy

############################################
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n = int(input())

max = 0
ti = -1
for i in range(n):
    data = list(map(int, input().split()))
    lists = list(set(itertools.combinations(data, 3)))
    lists.sort()

    tm = 0
    for j in range(len(lists)):
        if tm <= sum(lists[j]) % 10:
            tm = sum(lists[j]) % 10

    if max <= tm:
        max = tm
        ti = i + 1

print(ti)
